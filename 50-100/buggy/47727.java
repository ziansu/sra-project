public void show500(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Throwable e) throws java.io.IOException, javax.servlet.ServletException {
    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    request.setAttribute(com.lftechnology.batch7crud.controller.HTTPStatusHandler.MESSAGE, e.getMessage());
    javax.servlet.RequestDispatcher view = request.getRequestDispatcher(com.lftechnology.batch7crud.controller.HTTPStatusHandler.ERROR_PAGE);
    view.forward(request, response);
}