private void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    session = request.getSession();
    if ((session.getAttribute("username")) == null)
        response.sendRedirect("login.jsp");
    else {
        session.invalidate();
        java.lang.System.out.println((("User " + (session.getAttribute("username"))) + " has logged out"));
        response.sendRedirect("login.jsp");
    }
}