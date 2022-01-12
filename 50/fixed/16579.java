@java.lang.Override
public void write(byte[] buffer, int offset, int count) throws java.io.IOException {
    out.write(buffer, offset, count);
    size += count;
}