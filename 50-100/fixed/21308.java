private static byte[] getFirstFourBytes(java.io.InputStream is) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    byte[] bytes = new byte[4];
    int obtainedBytes = 0;
    int length;
    while ((length = is.read(bytes)) != (-1)) {
        baos.write(bytes, 0, length);
        obtainedBytes += length;
        if (obtainedBytes >= 4) {
            break;
        }
    } 
    return baos.toByteArray();
}