@java.lang.Override
protected void writeTo(javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    java.io.OutputStream outStream = response.getOutputStream();
    response.setHeader("Content-Disposition", ("attachment;filename=" + (file.getFilename())));
    response.setContentType(file.getContentType());
    response.setContentLength(((int) (file.getLength())));
    file.writeTo(outStream);
    outStream.flush();
    outStream.close();
}