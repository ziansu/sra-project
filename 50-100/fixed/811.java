private void editProcess(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int roll) throws com.lftechnology.batch7crud.exception.DataException, java.io.IOException, javax.servlet.ServletException {
    java.lang.String name = request.getParameter("name");
    java.lang.String address = request.getParameter("address");
    com.lftechnology.batch7crud.model.Student s = new com.lftechnology.batch7crud.model.Student(name, address, roll);
    com.lftechnology.batch7crud.service.StudentServices stdServices = new com.lftechnology.batch7crud.service.StudentServices();
    stdServices.update(s);
    response.sendRedirect("/Students");
}