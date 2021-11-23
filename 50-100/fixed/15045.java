public void read(final byte[] buffer, final long size) throws java.io.IOException {
    for (int i = 0, length = ((int) (size / 8)); i < length; i++) {
        buffer[i] = 0;
    }
    for (int i = 0; i < size; i++) {
        buffer[(i / 8)] |= (read()) << (7 - (i % 8));
    }
}