@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.io.PrintWriter out = resp.getWriter();
    out.print("<h1>Hello World</h1>");
    out.close();
    try {
        parser.goToResults(req, resp);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}