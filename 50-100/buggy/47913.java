public int read() throws java.io.IOException {
    char[] c = new char[1];
    int count = read(c, 0, 1);
    if (count < 0) {
        return -1;
    }
    return c[0];
}