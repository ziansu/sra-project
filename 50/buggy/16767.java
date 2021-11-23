@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpSession session) {
    java.lang.String userName = request.getParameter("userName");
    java.lang.System.out.println(("in login >> " + userName));
    session.setAttribute("userName", userName);
    chatbox.UserDatabase.login(userName);
    return "redirect:mainpage";
}