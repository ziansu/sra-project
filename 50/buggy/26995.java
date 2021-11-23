@org.springframework.web.bind.annotation.RequestMapping(value = "login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String login(@org.springframework.web.bind.annotation.RequestParam(value = "logout", required = false)
java.lang.String logout, javax.servlet.http.HttpServletRequest request) throws by.itechart.flowerty.web.exception.NotFoundException {
    LOGGER.info("move to login page");
    if (logout != null) {
        LOGGER.info("logout user");
        return "home/index";
    }
    return "signin/signin";
}