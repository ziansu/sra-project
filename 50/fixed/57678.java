@org.springframework.web.bind.annotation.RequestMapping(value = "/get", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.sprouts.model.Authority userInfo() throws java.lang.Exception {
    return authorityService.findByPrincipal();
}