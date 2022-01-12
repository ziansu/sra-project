protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String user = request.getParameter("user");
    java.lang.String password = request.getParameter("pass");
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    java.io.PrintWriter out = response.getWriter();
    try {
        if (db.DbLogic.validateCredentials(user, password)) {
            out.write("valid");
        }
    } finally {
        out.close();
    }
}