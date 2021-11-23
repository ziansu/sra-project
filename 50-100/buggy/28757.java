protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    request.setCharacterEncoding("windows-1251");
    int id = java.lang.Integer.parseInt(request.getParameter("id"));
    java.lang.String comment = request.getParameter("comment");
    hospital.services.VisitService.update(id, comment);
    response.sendRedirect("/patientsView");
}