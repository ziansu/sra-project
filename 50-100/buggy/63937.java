private static java.lang.String readBytes(java.io.DataInputStream in, int n) {
    java.lang.String line = "";
    for (int i = 0; i < n; i++) {
        try {
            char character = ((char) (in.readByte()));
            line += character;
        } catch (java.io.IOException e) {
            java.lang.System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    return line;
}