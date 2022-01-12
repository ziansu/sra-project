void writeInResponse(final javax.servlet.http.HttpServletResponse httpResponse, final java.lang.String text) throws java.io.IOException {
    httpResponse.setContentType("application/json");
    final java.io.OutputStream outputStream = httpResponse.getOutputStream();
    try {
        outputStream.write(text.getBytes(ProjectConfiguration.ENCODING.value));
    } finally {
    }
}