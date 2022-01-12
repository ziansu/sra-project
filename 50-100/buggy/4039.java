@com.funcxy.oj.controllers.RequestMapping(value = "/{username}/profile", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity putProfile(@com.funcxy.oj.controllers.RequestBody
@javax.validation.Valid
com.funcxy.oj.controllers.Profile profile, @com.funcxy.oj.controllers.PathVariable
java.lang.String username, javax.servlet.http.HttpSession httpSession) {
    if (com.funcxy.oj.utils.UserUtil.isSignedIn(httpSession)) {
        com.funcxy.oj.controllers.User userFound = userRepository.findById(((org.bson.types.ObjectId) (httpSession.getAttribute("userId"))));
        userFound.setProfile(profile);
        userRepository.save(userFound);
        return new org.springframework.http.ResponseEntity(profile, org.springframework.http.HttpStatus.OK);
    }
    return new org.springframework.http.ResponseEntity(new com.funcxy.oj.controllers.ForbiddenError(), org.springframework.http.HttpStatus.FORBIDDEN);
}