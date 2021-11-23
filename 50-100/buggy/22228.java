@java.lang.Override
public int read() throws java.io.IOException {
    bytesRead = delegate.read();
    ++(totalBytes);
    if ((totalBytes) < (storeBytes)) {
        addBytes(new byte[]{ ((byte) (bytesRead)) }, 1);
    }
    return bytesRead;
}