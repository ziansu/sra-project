@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String login1(javax.servlet.http.HttpSession session, javax.servlet.http.HttpServletRequest request) {
    if ((session.getAttribute("user")) != null) {
        request.removeAttribute("notification");
        session.setAttribute("notification", "You are already logged in.");
        return "index";
    }else {
        session.removeAttribute("notification");
        session.removeAttribute("notifsignup");
        request.setAttribute("url", request.getParameter("url"));
        return "login";
    }
}