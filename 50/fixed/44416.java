@java.lang.Override
public void write(byte[] b, int off, int len) throws java.io.IOException {
    grab(len);
    out.write(b, off, len);
}