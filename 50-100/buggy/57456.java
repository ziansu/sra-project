public java.lang.String getString(java.io.InputStream inputStream) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    byte[] buffer = new byte[1024];
    int length;
    java.lang.String result;
    while ((length = inputStream.read(buffer)) != (-1)) {
        baos.write(buffer, 0, length);
    } 
    result = baos.toString("UTF-8");
    baos.close();
    baos.flush();
    return result;
}