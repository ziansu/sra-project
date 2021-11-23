private byte readByte() {
    try {
        (bytesRead)++;
        return input.readByte();
    } catch (java.io.IOException e) {
        java.lang.System.err.println(e.toString());
    }
}