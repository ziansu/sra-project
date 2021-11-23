@org.springframework.web.bind.annotation.RequestMapping(value = "/logout")
public void logout(java.security.Principal principal, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    request.getSession().invalidate();
    java.lang.String redirectUrl = request.getParameter("redirect");
    response.sendRedirect(redirectUrl);
    return ;
}