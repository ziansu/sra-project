@java.lang.Override
public void close() throws java.io.IOException {
    ensureStreamExists();
    stream.close();
}