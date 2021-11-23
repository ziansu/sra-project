private void list(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int page) throws java.io.IOException, javax.servlet.ServletException {
    com.lftechnology.batch7crud.service.StudentServices stdservice = new com.lftechnology.batch7crud.service.StudentServices();
    try {
        request.setAttribute("students", stdservice.fetch(page));
        request.getServletContext().getRequestDispatcher("/WEB-INF/views/students.jsp").forward(request, response);
    } catch (com.lftechnology.batch7crud.exception.DataException e) {
        com.lftechnology.batch7crud.controller.StudentListController.LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage());
    }
}