protected void retrieveSessionInformations(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.setStatus(HttpServletResponse.SC_OK);
    com.google.gson.JsonObject res;
    try {
        res = getJsonSessionInformations(request);
        response.getWriter().print(res);
        response.getWriter().close();
    } catch (com.google.gson.JsonSyntaxException e) {
        throw new org.openqa.grid.common.exception.GridException(e.getMessage());
    }
}