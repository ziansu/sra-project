@org.springframework.web.bind.annotation.RequestMapping(value = org.proffart.carpool.utils.RequestMappings.createUser, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity create(@org.springframework.web.bind.annotation.RequestBody
org.proffart.carpool.domain.User user) throws java.lang.Exception {
    if (userService.userExists(user.getUserName())) {
        throw new org.proffart.carpool.exception.UserException(org.proffart.carpool.exception.ErrorStrings.USER_NAME_EXISTS);
    }
    userService.create(user);
    userService.checkCredentials(user.getUserName());
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
}