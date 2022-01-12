@org.springframework.web.bind.annotation.RequestMapping(value = "/greeting")
public hello.Greeting greeting() {
    return new hello.Greeting();
}