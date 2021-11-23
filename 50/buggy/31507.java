@org.springframework.web.bind.annotation.RequestMapping(value = "/greeting")
public hello.Greeting greeting(@org.springframework.web.bind.annotation.RequestParam(value = "name", defaultValue = "World")
java.lang.String name) {
    return new hello.Greeting(counter.incrementAndGet(), java.lang.String.format(hello.GreetingController.template, name));
}