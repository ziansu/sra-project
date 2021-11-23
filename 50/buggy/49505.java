@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    return super.read(b, off, java.lang.Math.min(available(), len));
}