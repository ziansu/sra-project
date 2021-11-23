static byte[] readWhole(java.io.File input) throws java.io.IOException {
    java.io.FileInputStream inStream = new java.io.FileInputStream(input);
    int len = ((int) (input.length()));
    byte[] bytes = new byte[len];
    if ((inStream.read(bytes, 0, len)) != len) {
        throw new java.io.IOException(("expected size: " + len));
    }
    inStream.close();
    return bytes;
}