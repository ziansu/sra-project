@org.springframework.web.bind.annotation.RequestMapping(value = "/users/email/course/notmatch", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<java.lang.String> getMatchedNotWithMe(@org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam(value = "gcode")
java.lang.String gcode) {
    java.util.List<java.lang.String> users = course.getAllUsers(domain.util.Gcode.fromString(gcode));
    users.removeAll(course.getMatchedWithMe(email, domain.util.Gcode.fromString(gcode)));
    users.remove(email);
    return users;
}