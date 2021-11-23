@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    if (isCancel.get()) {
        return -1;
    }
    int bytes = input.read(b, off, len);
    if ((-1) == bytes) {
        listener.finished();
        return bytes;
    }
    listener.update(bytes);
    return bytes;
}