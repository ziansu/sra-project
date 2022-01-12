public void show404(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
    request.setAttribute(com.lftechnology.batch7crud.controller.MESSAGE, com.lftechnology.batch7crud.controller.PAGE_NOT_FOUND);
    try {
        request.getRequestDispatcher(com.lftechnology.batch7crud.controller.ERROR_PAGE).forward(request, response);
    } catch (javax.servlet.ServletException e) {
        com.lftechnology.batch7crud.controller.CustomHttpServlet.LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), e);
    } catch (java.io.IOException e) {
        com.lftechnology.batch7crud.controller.CustomHttpServlet.LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), e);
    }
}