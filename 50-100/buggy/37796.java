public void swallowFileContent(java.io.InputStream fis, java.io.PrintStream fos) throws java.io.IOException {
    int n;
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    byte[] buffer = new byte[65536];
    while ((n = fis.read(buffer)) != (-1))
        baos.write(buffer, 0, n);
    
    baos.writeTo(fos);
    baos.close();
}