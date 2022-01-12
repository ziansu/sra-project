private void list(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int page) throws com.lftechnology.batch7crud.exception.DataException, java.io.IOException, javax.servlet.ServletException {
    com.lftechnology.batch7crud.service.StudentServices stdservice = new com.lftechnology.batch7crud.service.StudentServices();
    request.setAttribute("students", stdservice.fetch(page));
    request.getServletContext().getRequestDispatcher("/WEB-INF/views/students.jsp").forward(request, response);
}