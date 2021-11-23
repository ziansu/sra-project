@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpSession session) {
    java.lang.String userName = ((java.lang.String) (session.getAttribute("userName")));
    java.lang.System.out.println(("in logout >> " + userName));
    chatbox.UserDatabase.logout(userName);
    try {
        request.logout();
    } catch (javax.servlet.ServletException ex) {
        ex.printStackTrace();
        session.invalidate();
    }
    return "index";
}