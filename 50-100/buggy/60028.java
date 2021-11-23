public static void saveUrl(java.net.URL u, java.io.File savedAs) throws java.io.IOException {
    java.net.URLConnection connection = u.openConnection();
    java.io.InputStream inputStream = new java.io.BufferedInputStream(u.openStream(), 10240);
    java.io.FileOutputStream outputStream = new java.io.FileOutputStream(savedAs);
    byte[] buffer = new byte[1024];
    int dataSize;
    while ((dataSize = inputStream.read(buffer)) != (-1)) {
        outputStream.write(buffer, 0, dataSize);
    } 
    outputStream.close();
}