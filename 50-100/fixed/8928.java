protected void show404(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
    request.setAttribute(com.lftechnology.batch7crud.controller.HTTPStatusHandler.MESSAGE, "Page Not Found");
    javax.servlet.RequestDispatcher view = request.getRequestDispatcher(com.lftechnology.batch7crud.controller.HTTPStatusHandler.ERROR_PAGE);
    view.forward(request, response);
}