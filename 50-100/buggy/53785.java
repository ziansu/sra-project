private void edit(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int roll) throws java.io.IOException, javax.servlet.ServletException {
    com.lftechnology.batch7crud.service.StudentServices stdservice = new com.lftechnology.batch7crud.service.StudentServices();
    try {
        request.setAttribute("student", stdservice.fetchById(roll));
        request.getRequestDispatcher("/WEB-INF/views/editEntry.jsp").forward(request, response);
    } catch (com.lftechnology.batch7crud.exception.DataException e) {
        com.lftechnology.batch7crud.controller.StudentListController.LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage());
    }
}