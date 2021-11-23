private byte[] loadData(java.io.InputStream fis) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    byte[] buffer = new byte[256];
    int len;
    while (0 < (len = fis.read(buffer))) {
        baos.write(buffer, 0, len);
    } 
    return baos.toByteArray();
}