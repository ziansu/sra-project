private void editProcess(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int roll) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String name = request.getParameter("name");
    java.lang.String address = request.getParameter("address");
    com.lftechnology.batch7crud.model.Student s = new com.lftechnology.batch7crud.model.Student(name, address, roll);
    com.lftechnology.batch7crud.service.StudentServices stdServices = new com.lftechnology.batch7crud.service.StudentServices();
    try {
        stdServices.update(s);
        response.sendRedirect("/Students");
    } catch (com.lftechnology.batch7crud.exception.DataException e) {
        com.lftechnology.batch7crud.controller.StudentListController.LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage());
    }
}