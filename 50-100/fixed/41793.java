@java.lang.Override
public int read(char[] cbuf, int offset, int len) throws java.io.IOException {
    if (!(ready())) {
        return -1;
    }
    for (int i = 0; i < len; i++) {
        int c = read();
        if (c < 0) {
            return i;
        }else {
            cbuf[(offset + i)] = ((char) (c));
        }
    }
    return len;
}