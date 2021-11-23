public void sendFile(java.lang.String str) throws java.io.IOException {
    java.lang.String path = this.servlet.getServletContext().getRealPath(str);
    java.lang.System.out.println(path);
    java.io.File file = new java.io.File(path);
    addHeader("Content-Length", ("" + (file.length())));
    addHeader("Content-Type", java.nio.file.Files.probeContentType(file.toPath()));
    java.io.InputStream inputStream = new java.io.FileInputStream(file);
    sendFile(inputStream);
    inputStream.close();
}