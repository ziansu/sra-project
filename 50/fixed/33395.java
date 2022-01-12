@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.lang.String home() {
    com.pm.server.controller.HomeController.log.info("Mapped GET /");
    return "Welcome to the Pac Macro server!";
}