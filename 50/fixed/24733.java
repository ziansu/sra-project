@org.springframework.web.bind.annotation.GetMapping(value = "/getClientDelay")
public java.lang.String getClientDelay(@org.springframework.web.bind.annotation.RequestParam
java.lang.String key) {
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    test.ygy.controller.HelloController.log.info("  this is eureka client asyn server");
    return " hello ,i am eureka client server asyn" + key;
}