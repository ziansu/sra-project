@rest.controller.RequestMapping(value = "/user/", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.Void> createUser(@rest.controller.RequestBody
rest.model.User user, org.springframework.web.util.UriComponentsBuilder uriComponentsBuilder) {
    if (userService.isUserExist(user)) {
        return new org.springframework.http.ResponseEntity<java.lang.Void>(org.springframework.http.HttpStatus.CONFLICT);
    }
    userService.saveUser(user);
    org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
    httpHeaders.setLocation(uriComponentsBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
    return new org.springframework.http.ResponseEntity<java.lang.Void>(httpHeaders, org.springframework.http.HttpStatus.CREATED);
}