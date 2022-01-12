@com.smf.main.resources.RequestMapping(path = "/login", method = RequestMethod.POST, produces = "application/json")
@com.smf.main.resources.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public org.springframework.http.ResponseEntity<com.smf.main.model.UserResponse> checkLoginCredentials(@com.smf.main.resources.RequestBody
com.smf.main.model.User user) {
    boolean isUserExisting = credentialsService.checkUser(user);
    return isUserExisting == false ? new org.springframework.http.ResponseEntity(com.smf.main.model.UserResponse.builder().isOk(false).build(), org.springframework.http.HttpStatus.NOT_FOUND) : new org.springframework.http.ResponseEntity(com.smf.main.model.UserResponse.builder().isOk(true).build(), org.springframework.http.HttpStatus.OK);
}