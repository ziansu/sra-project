@java.lang.Override
public java.lang.String execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession(false);
    if (session != null) {
        session.invalidate();
    }
    return "/login.jsp";
}