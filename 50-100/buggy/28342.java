@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    com.excilys.cdb.servlets.ComputerDeleteServlet.LOGGER.debug("Entering doPost()");
    java.lang.String selection = request.getParameter("selection");
    if (selection != null) {
        java.util.stream.Stream.of(selection.split(",")).map(java.lang.Long::parseLong).forEach(this.computerService::deleteComputer);
    }
    com.excilys.cdb.servlets.ComputerDeleteServlet.LOGGER.debug("Exiting doPost()");
    response.sendRedirect(((request.getContextPath()) + "/dashboard"));
}