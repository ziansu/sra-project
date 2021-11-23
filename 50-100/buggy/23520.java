@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String id_log = req.getParameter("id_log");
    com.example.Nesrine.myapplication.backend.Logement logement = new com.example.Nesrine.myapplication.backend.DataBaseService().getDetailLogement("id_log");
    com.google.gson.Gson gson = new com.google.gson.Gson();
    resp.getWriter().print(gson.toJson(logement));
}