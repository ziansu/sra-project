@org.springframework.web.bind.annotation.RequestMapping(value = "/failed", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String fail() {
    return "login_failed";
}