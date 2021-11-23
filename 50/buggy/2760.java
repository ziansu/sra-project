@org.springframework.web.bind.annotation.RequestMapping(value = "/fail", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String fail(@org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password, @org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email) {
    return "login_failed";
}