@java.lang.Override
public void write(byte[] buffer, int offset, int count) throws java.io.IOException {
    super.write(buffer, offset, count);
    size += count;
}