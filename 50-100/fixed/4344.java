@java.lang.Override
public int read(final byte[] b, final int off, final int len) throws java.io.IOException {
    final int size = java.lang.Math.min(b.length, ((buffer.length()) - (pos)));
    if (size == 0) {
        return -1;
    }
    buffer.getBytes(pos, ((pos) + size), b, off);
    pos += size;
    return size;
}