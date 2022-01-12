@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    javax.servlet.http.HttpSession session = request.getSession();
    session.removeAttribute("notification");
    session.invalidate();
    response.setHeader("Pragma", "No-cache");
    response.setDateHeader("Expires", 0);
    response.setHeader("Cache-Control", "no-cache");
    return "index";
}