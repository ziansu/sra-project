@org.springframework.web.bind.annotation.RequestMapping(value = "/users/email/course/match", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<java.lang.String> getMatchedWithMe(@org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam(value = "gcode")
java.lang.String gcode) {
    return course.getMatchedWithMe(email, domain.util.Gcode.fromString(gcode));
}