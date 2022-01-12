protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String dbname = "doglovers";
    try {
        org.ektorp.CouchDbConnector dbc = _db.createConnector(dbname, true);
        java.util.List<java.lang.String> list = dbc.getAllDocIds();
        for (java.lang.String lists : list) {
            response.getWriter().print(("Get all Ids!" + lists));
        }
    } catch (java.lang.Exception e) {
        response.getWriter().println(e.getMessage());
    }
}