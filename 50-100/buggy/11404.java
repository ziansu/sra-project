@org.springframework.web.bind.annotation.RequestMapping(value = "/fireBase")
public org.springframework.web.servlet.ModelAndView googleLogin(@org.springframework.web.bind.annotation.ModelAttribute(value = "userloggedin")
java.lang.String userLogged, @org.springframework.web.bind.annotation.RequestParam(value = "loggedIn", defaultValue = "false", required = false)
java.lang.String loggedIn) {
    if (!(loggedIn.equals("false"))) {
        userLogged = loggedIn;
    }
    java.lang.System.out.println(("loggedIn: " + loggedIn));
    java.lang.System.out.println(("userLogged: " + userLogged));
    if (userLogged.equals("false")) {
        return new org.springframework.web.servlet.ModelAndView("fireBase");
    }else {
        return new org.springframework.web.servlet.ModelAndView("location", "userloggedin", userLogged);
    }
}