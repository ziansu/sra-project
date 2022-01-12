@com.chronicle.controller.RequestMapping(value = { "/login/{id}/{password}" }, method = RequestMethod.GET, produces = { org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
public java.lang.String login(@com.chronicle.controller.PathVariable
java.lang.Long id, @com.chronicle.controller.PathVariable
java.lang.String password) {
    logger.info(("login with id : {}" + id));
    com.chronicle.controller.User user = userService.findById(id);
    java.lang.System.out.println(user.getPassword());
    java.lang.System.out.println(password);
    if (user.getPassword().equals(password)) {
        return user.getRole();
    }else {
        return "User Doesn't exist";
    }
}