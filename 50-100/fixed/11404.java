@org.springframework.web.bind.annotation.RequestMapping(value = "/fireBase")
public org.springframework.web.servlet.ModelAndView googleLogin(@org.springframework.web.bind.annotation.ModelAttribute(value = "userloggedin")
java.lang.String userLogged, @org.springframework.web.bind.annotation.RequestParam(value = "loggedIn", defaultValue = "", required = false)
java.lang.String loggedIn) {
    java.lang.System.out.println(("loggedIn: " + loggedIn));
    if ((loggedIn.isEmpty()) || (loggedIn.equals(null))) {
        return new org.springframework.web.servlet.ModelAndView("fireBase");
    }
    java.lang.System.out.println(("userLogged: " + userLogged));
    if ((userLogged.equals(null)) || (userLogged.isEmpty())) {
        userLogged = loggedIn;
    }
    return new org.springframework.web.servlet.ModelAndView("location", "userloggedin", userLogged);
}