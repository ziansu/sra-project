@com.chronicle.controller.RequestMapping(value = { "/login/{id}/{pswd}" }, method = RequestMethod.GET, produces = { org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
public java.lang.String login(@com.chronicle.controller.PathVariable
java.lang.Long id, java.lang.String password) {
    logger.info(("login with id : {}" + id));
    com.chronicle.controller.User user = userService.findById(id);
    if ((user.getPassword()) == password) {
        return user.getRole();
    }else {
        return "User Doesn't exist";
    }
}