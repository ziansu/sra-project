public static void copy(final java.io.Reader input, final java.io.Writer output, final int bufferSize) throws java.io.IOException {
    final char[] buffer = new char[bufferSize];
    int n = 0;
    while ((-1) != (n = input.read(buffer))) {
        output.write(buffer, 0, n);
    } 
    output.flush();
}