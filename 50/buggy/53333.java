@org.springframework.web.bind.annotation.RequestMapping(value = "/api", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String api() {
    de.hawhamburg.services.controller.ServiceController.LOG.info("api request");
    return "This is the api resoruce";
}