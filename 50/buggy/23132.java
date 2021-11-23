@org.springframework.web.bind.annotation.RequestMapping(value = "/users/email", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<domain.util.Gcode> getEnrolledIn(@org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email) {
    java.util.List<domain.util.Gcode> list = course.getEnrolledIn(email);
    java.lang.System.out.println(list);
    return list;
}