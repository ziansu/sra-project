private static java.lang.String readBytes(java.io.DataInputStream in, int n) throws java.io.IOException {
    java.lang.String line = "";
    for (int i = 0; i < n; i++) {
        char character = ((char) (in.readByte()));
        line += character;
    }
    return line;
}