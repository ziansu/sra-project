private static byte[] getFirstFourBytes(java.io.InputStream is) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    byte[] bytes = new byte[4];
    int obtainedBytes = 0;
    int length;
    while (((length = is.read(bytes)) != (-1)) || (obtainedBytes != 4)) {
        baos.write(bytes, 0, length);
        obtainedBytes += length;
    } 
    return baos.toByteArray();
}