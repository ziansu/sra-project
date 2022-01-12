@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpSession session) {
    java.lang.String userName = ((java.lang.String) (session.getAttribute("userName")));
    chatbox.UserDatabase.logout(userName);
    try {
        request.logout();
        session.invalidate();
    } catch (javax.servlet.ServletException ex) {
        ex.printStackTrace();
    }
    return "index";
}