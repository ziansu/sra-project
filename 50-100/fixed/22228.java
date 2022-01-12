@java.lang.Override
public int read() throws java.io.IOException {
    bytesRead = delegate.read();
    if ((bytesRead) >= 0) {
        ++(totalBytes);
        if ((totalBytes) < (storeBytes)) {
            addBytes(new byte[]{ ((byte) (bytesRead)) }, 1);
        }
    }
    return bytesRead;
}