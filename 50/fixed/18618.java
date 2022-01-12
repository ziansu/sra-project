@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    if ((bufferStream) == null) {
        bufferValue();
    }
    return bufferStream.read(b, off, len);
}