private void edit(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int roll) throws com.lftechnology.batch7crud.exception.DataException, java.io.IOException, javax.servlet.ServletException {
    com.lftechnology.batch7crud.service.StudentServices stdservice = new com.lftechnology.batch7crud.service.StudentServices();
    request.setAttribute("student", stdservice.fetchById(roll));
    request.getRequestDispatcher("/WEB-INF/views/editEntry.jsp").forward(request, response);
}