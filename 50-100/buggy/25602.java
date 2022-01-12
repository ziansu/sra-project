@rest.controller.RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
public org.springframework.http.ResponseEntity<rest.model.User> deleteUser(@rest.controller.PathVariable(value = "id")
java.lang.Integer id) {
    java.lang.System.out.println(("delete: id=" + id));
    rest.model.User user = userService.findById(id);
    java.lang.System.out.println(("delete: " + user));
    if (user == null) {
        return new org.springframework.http.ResponseEntity<rest.model.User>(org.springframework.http.HttpStatus.NOT_FOUND);
    }
    userService.deleteUserById(id);
    return new org.springframework.http.ResponseEntity<rest.model.User>(org.springframework.http.HttpStatus.NO_CONTENT);
}