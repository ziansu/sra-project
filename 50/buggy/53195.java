@java.lang.Override
public void close() throws java.io.IOException {
    logWriter.flush();
    this.logWriter.close();
}