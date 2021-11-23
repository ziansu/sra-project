protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    request.getSession().setAttribute("pass", null);
    response.sendRedirect("Login");
}