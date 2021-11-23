protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String dbname = "doglovers";
    try {
        org.ektorp.CouchDbConnector dbc = _db.createConnector(dbname, true);
        wasdev.sample.servlet.List<java.lang.String> list = dbc.getAllDocIds();
        for (wasdev.sample.servlet.Sting lists : list) {
            response.getWriter().print(("Get all Ids!" + lists));
        }
    } catch (java.lang.Exception e) {
        response.getWriter().println(e.getMessage());
    }
}