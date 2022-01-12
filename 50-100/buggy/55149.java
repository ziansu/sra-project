private void deleteProcess(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    try {
        int employeeId = parameterValueAsInt(request, 2);
        com.lftechnology.batch7crud.controller.EmployeeController.employeeService.deleteEmployee(employeeId);
        response.sendRedirect(((request.getContextPath()) + (ROUTE_EMPLOYEES)));
    } catch (com.lftechnology.batch7crud.exception.DataException e) {
        com.lftechnology.batch7crud.controller.EmployeeController.LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), e);
        show500(request, response, e);
    } catch (java.lang.NumberFormatException e) {
        show404(request, response);
    }
}