public int read(char[] cbuf, int off, int len) throws java.io.IOException {
    int read = 0;
    for (int i = 0; i < len; i++) {
        read = decoder.decode(in);
        if (read == (-1)) {
            return i;
        }
        cbuf[(i + off)] = ((char) (read));
    }
    return len;
}