@java.lang.Override
public synchronized void write(final byte[] data, int off, int len) throws java.io.IOException {
    checkClose();
    int length = len;
    int offset = off;
    while (length > 0) {
        final int n = buffer.write(data, offset, len);
        offset += n;
        length -= n;
    } 
}