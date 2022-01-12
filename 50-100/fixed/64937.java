public static void copy(final java.io.InputStream input, final java.io.OutputStream output, final int bufferSize) throws java.io.IOException {
    final byte[] buffer = new byte[bufferSize];
    int n = 0;
    while (0 <= (n = input.read(buffer))) {
        output.write(buffer, 0, n);
    } 
}