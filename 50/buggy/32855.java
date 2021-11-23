@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    int bytes = in.read(b, off, len);
    count += bytes;
    return bytes;
}