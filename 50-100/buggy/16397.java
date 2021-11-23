private void sendResp(com.epam.freelancer.database.model.UserEntity ue, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    ue.setPassword(null);
    java.lang.String json = new com.google.gson.Gson().toJson(ue);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.setStatus(HttpServletResponse.SC_OK);
    response.getWriter().write(json);
    response.getWriter().flush();
    response.getWriter().close();
}