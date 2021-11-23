@java.lang.Override
public void close() throws java.io.IOException {
    logWriter.flush();
    logWriter.close();
}