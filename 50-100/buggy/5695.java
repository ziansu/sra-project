@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    int x = is.read(b, off, len);
    for (int n = 0; n < x; n++) {
        (count)++;
        if ((b[n]) == '\n') {
            lines.add(count);
        }
    }
    return x;
}