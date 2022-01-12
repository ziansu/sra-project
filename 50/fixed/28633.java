public void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
    objects.HomePage.getInstance();
    java.lang.String keywords = req.getParameter("keywords").toLowerCase();
    objects.Facade.basicSearch(keywords);
    resp.sendRedirect("results.jsp");
}