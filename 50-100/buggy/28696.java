protected void respond(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    response.setStatus(HttpServletResponse.SC_OK);
    response.setCharacterEncoding(org.eclipse.jetty.servlets.EventSourceServlet.UTF_8.name());
    response.setContentType("text/event-stream");
    response.addHeader("Connection", "close");
    response.flushBuffer();
}