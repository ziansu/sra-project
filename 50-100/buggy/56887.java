private void show(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws com.lftechnology.batch7crud.exception.DataException, java.io.IOException, javax.servlet.ServletException {
    try {
        int id = parameterValueAsInt(request, 2);
        com.lftechnology.batch7crud.entity.Student student = com.lftechnology.batch7crud.controller.StudentController.studentService.fetchStudentById(id);
        request.setAttribute(com.lftechnology.batch7crud.controller.STUDENT, student);
        request.getRequestDispatcher(com.lftechnology.batch7crud.controller.EDIT_PAGE).forward(request, response);
    } catch (java.lang.NumberFormatException e) {
        show404(request, response);
    }
}