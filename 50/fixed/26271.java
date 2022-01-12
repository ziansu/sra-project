protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    int id = java.lang.Integer.parseInt(request.getParameter("id"));
    response.sendRedirect("/patientsView");
}