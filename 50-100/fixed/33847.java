@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    try {
        java.lang.String[] listId = request.getParameterValues("selection");
        java.lang.System.out.println(listId);
        response.sendRedirect(Util.DASH_REDIRECT);
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.out.println(e.getMessage());
        response.sendError(Util.ERROR_500);
    }
}