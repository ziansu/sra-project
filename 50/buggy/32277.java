@java.lang.Override
public int read(final byte[] b) throws java.io.IOException {
    bytesRead = delegate.read(b);
    totalBytes += bytesRead;
    addBytes(b, bytesRead);
    return bytesRead;
}