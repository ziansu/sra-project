@com.smartsync.controller.RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/json")
public org.springframework.http.ResponseEntity getUserById(@com.smartsync.controller.PathVariable(value = "id")
java.lang.Long id) {
    logger.info(("Getting user information for id: " + id));
    com.smartsync.model.User user = this.userService.getUserById(id);
    if (user == null) {
        java.lang.String message = ("Could not find user with id " + id) + ".";
        java.lang.String url = "/users/" + id;
        logger.error(message);
        throw new com.smartsync.controller.UserNotFoundException(message, url);
    }
    logger.info(("Successfully got user information: " + user));
    return org.springframework.http.ResponseEntity.ok(user);
}