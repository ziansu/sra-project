@java.lang.Override
public int read(char[] cbuf, int off, int len) throws java.io.IOException {
    if (!(ready())) {
        return -1;
    }
    len += off;
    for (int i = off; i < len; i++) {
        int c = read();
        if (c < 0) {
            return i - off;
        }else {
            cbuf[i] = ((char) (c));
        }
    }
    return len - off;
}