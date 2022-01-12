@io.swagger.annotations.ApiOperation(value = "Compares a username with all already existing usernames")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/users/unique/username", consumes = "application/json")
public org.springframework.http.ResponseEntity<java.lang.Boolean> checkUsernameAlreadyExists(@io.swagger.annotations.ApiParam(value = "Username", required = true)
@org.springframework.web.bind.annotation.RequestBody
java.lang.String username) {
    boolean userExists = false;
    if ((userRepository.findByUsername(username)) == null) {
        userExists = false;
    }else {
        userExists = true;
    }
    LOGGER.debug(("username exists: " + userExists));
    return new org.springframework.http.ResponseEntity<java.lang.Boolean>(userExists, org.springframework.http.HttpStatus.OK);
}