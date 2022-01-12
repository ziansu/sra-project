@com.smartsync.controller.RequestMapping(method = RequestMethod.DELETE, value = "/{id}", produces = "application/json")
public org.springframework.http.ResponseEntity deleteUser(@com.smartsync.controller.PathVariable(value = "id")
java.lang.Long id) {
    com.smartsync.model.User user = this.userService.deleteUser(id);
    if (user == null) {
        java.lang.String message = "Could not delete user with id: " + id;
        java.lang.String url = "/users/" + id;
        logger.error((("Could not find user with id: " + id) + " to delete"));
        throw new com.smartsync.controller.UserNotFoundException(message, url);
    }
    logger.info(("Successfully deleted user: " + user));
    return org.springframework.http.ResponseEntity.ok(user);
}