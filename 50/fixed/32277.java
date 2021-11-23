@java.lang.Override
public int read(final byte[] b) throws java.io.IOException {
    bytesRead = delegate.read(b);
    if ((bytesRead) >= 0) {
        totalBytes += bytesRead;
        addBytes(b, bytesRead);
    }
    return bytesRead;
}