public final int readUnsignedShort() throws java.io.IOException {
    int ch1 = read();
    int ch2 = read();
    if ((ch1 | ch2) < 0) {
        throw new java.io.EOFException();
    }
    return (ch1 << 8) + (ch2 << 0);
}