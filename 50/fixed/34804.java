@org.springframework.web.bind.annotation.RequestMapping(value = "log")
public void log() {
    org.yyf.gradleDemo.web.controller.TestController.logger.trace("trace info");
    org.yyf.gradleDemo.web.controller.TestController.logger.fatal("fatal info");
}