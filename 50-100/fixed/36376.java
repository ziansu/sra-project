private void printInvalid(javax.servlet.http.HttpServletResponse resp, java.io.PrintWriter out) {
    resp.setContentType("text/plain");
    out.println("Invalid request. Examples:");
    out.println(("/json?type=100&source=30&since=" + ((java.lang.System.currentTimeMillis()) - (3600 * 1000))));
    out.println("/xml");
    out.println(("/lsf&since=" + ((java.lang.System.currentTimeMillis()) - (3600 * 1000))));
    resp.setStatus(400);
    out.close();
}