package com.example.multimodule.module1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Module1Controller {

    @GetMapping
    public String hello() {
        return "Hello from module 1";
    }
}
