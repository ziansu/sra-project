private void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    session = request.getSession();
    if ((session.getAttribute("username")) == null)
        response.sendRedirect("login.jsp");
    else {
        java.lang.System.out.println((("User " + (session.getAttribute("username"))) + " has logged out"));
        session.invalidate();
        response.sendRedirect("login.jsp");
    }
}