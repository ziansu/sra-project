@java.lang.Override
public int read(byte[] b) throws java.io.IOException {
    int bytes = in.read(b);
    count += bytes;
    return bytes;
}