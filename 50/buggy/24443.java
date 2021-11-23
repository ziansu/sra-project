@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println(("\nCompanyServlet: " + (req.getQueryString())));
    req.getRequestDispatcher("/_view/Company.jsp").forward(req, resp);
}