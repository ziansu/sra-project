static byte[] readWhole(java.io.File input) throws java.io.IOException {
    int len = ((int) (input.length()));
    byte[] bytes = new byte[len];
    try (java.io.FileInputStream inStream = new java.io.FileInputStream(input)) {
        if ((inStream.read(bytes, 0, len)) != len) {
            throw new java.io.IOException(("expected size: " + len));
        }
    }
    return bytes;
}