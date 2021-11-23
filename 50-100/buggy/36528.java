protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    edu.letu.libprint.test.TestServlet.instance = this;
    java.io.PrintWriter writer = response.getWriter();
    writer.println("<html><head><title>LibPrint Test Servlet</title></head><body><pre>");
    new edu.letu.libprint.test.DatabaseTest().performTests(writer);
    new edu.letu.libprint.test.ClientUploadTest().performTests(writer);
    writer.println("</pre></body></html>");
}