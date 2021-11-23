@java.lang.Override
public void close() throws java.io.IOException {
    closed.set(true);
    if ((randomAccessFile) != null) {
        randomAccessFile.close();
    }
}