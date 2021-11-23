private static int read(java.io.InputStream is, byte[] buffer, int size, int offset) throws java.io.IOException {
    final int length = size - offset;
    int read;
    for (read = 0; read < length;) {
        int n = is.read(buffer, (offset + read), (length - read));
        if (0 > n) {
            if (0 == read) {
                return n;
            }
            break;
        }
        read += n;
    }
    return read;
}