@java.lang.Override
public synchronized int read(byte[] b, int off, int len) {
    return super.read(b, off, 21);
}