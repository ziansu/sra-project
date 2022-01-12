@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    int readcount = in.read(b, off, len);
    if (readcount > 0) {
        out.write(b, off, readcount);
    }
    return readcount;
}