@java.lang.Override
public int read() throws java.io.IOException {
    try {
        return raf.readByte();
    } catch (final java.io.EOFException e) {
        return -1;
    }
}