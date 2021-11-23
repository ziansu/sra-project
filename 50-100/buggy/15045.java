public void read(final byte[] buffer, final long size) throws java.io.IOException {
    for (int i = 0; i < size; i++) {
        buffer[(i / 8)] |= (read()) << (7 - (i % 8));
    }
}