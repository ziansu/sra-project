@org.springframework.web.bind.annotation.RequestMapping(value = "/healthcheck")
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.String> healthCheck() {
    java.lang.String env = ("<p>Environment : " + (java.lang.System.getProperty("env"))) + "</p>";
    java.lang.String sysProp = java.lang.System.getProperties().toString().replaceAll("[,]", "<br>");
    return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body((((com.rest.controller.AppController.healthCheckString) + env) + sysProp));
}