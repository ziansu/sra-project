@org.springframework.web.bind.annotation.GetMapping(value = "/getClient")
public java.lang.String getClient(@org.springframework.web.bind.annotation.RequestParam
java.lang.String key) {
    test.ygy.controller.HelloController.log.info("  this is eureka client server ");
    return " hello ,i am eureka client" + key;
}