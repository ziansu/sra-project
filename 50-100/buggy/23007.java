protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    core.Server serv = ((core.Server) (request.getServletContext().getAttribute("server")));
    serv.decActiveUsers();
    javax.servlet.http.HttpSession session = request.getSession();
    try {
        session.invalidate();
        response.sendRedirect("index.jsp");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}