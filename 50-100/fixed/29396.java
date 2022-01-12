public byte[] getBytes(java.io.InputStream is) throws java.lang.Exception {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    byte[] buffer = new byte[1024];
    int len = -1;
    while ((len = is.read(buffer)) != (-1)) {
        bos.write(buffer, 0, len);
    } 
    is.close();
    bos.flush();
    return bos.toByteArray();
}