private static void copy(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.lang.Exception {
    byte[] buffer = new byte[8192];
    int length;
    while ((length = inputStream.read(buffer)) != (-1)) {
        outputStream.write(buffer, 0, length);
    } 
    outputStream.close();
    inputStream.close();
}