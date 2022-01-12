@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.Object> login(@org.springframework.web.bind.annotation.RequestBody
org.univ7.webapp.quiz.domain.User user) {
    org.univ7.webapp.quiz.domain.User findedUser = userService.findUser(user);
    if (findedUser == null) {
        return org.univ7.webapp.quiz.util.JSONResponseUtil.getJSONResponse(new org.univ7.webapp.quiz.dto.JsonMessage(org.univ7.webapp.quiz.restcontroller.LoginController.CHECK_USER_ID_AND_PASSWORD_MESSAGE), HttpStatus.UNAUTHORIZED);
    }
    return org.univ7.webapp.quiz.util.JSONResponseUtil.getJSONResponse(org.univ7.webapp.quiz.dto.UserDto.getInstance(findedUser), HttpStatus.OK);
}