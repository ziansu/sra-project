protected void respond(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    response.setStatus(HttpServletResponse.SC_OK);
    response.setCharacterEncoding(null);
    response.setContentType("text/event-stream");
    response.addHeader("Connection", "close");
    response.flushBuffer();
}