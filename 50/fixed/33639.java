@io.swagger.annotations.ApiOperation(value = "Get an empty token based on no input")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = pet.store.spring.web.security.controllers.interfaces.SecurityTokenControllerI.TOKEN_BY_NOTHING_URL_PATH, produces = "application/json")
public java.lang.String get() throws java.lang.Exception {
    return "anonymous";
}