@java.lang.Override
protected void writeTo(javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    super.writeTo(response);
    java.io.PrintWriter writer = response.getWriter();
    writer.write(message.toString());
    writer.flush();
}