public int read(final byte[] buffer) throws java.io.IOException {
    if (buffer == null) {
        throw new java.lang.NullPointerException();
    }
    return this.read(buffer, 0, buffer.length);
}