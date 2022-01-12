@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    resp.setCharacterEncoding("UTF-8");
    resp.setContentType("text/html;charset=utf-8");
    javax.servlet.RequestDispatcher dispatcher = req.getRequestDispatcher("DelPage.jsp");
    dispatcher.include(req, resp);
    try {
        int id = java.lang.Integer.parseInt(req.getParameter("id"));
        java.lang.Class.forName("com.mysql.jdbc.Driver");
        ru.connection.db.DataBaseConnection dbc = new ru.connection.db.DataBaseConnection();
        dbc.delUser(id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}