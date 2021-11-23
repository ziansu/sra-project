@java.lang.Override
public void close() throws java.io.IOException {
    flushbuf();
    super.close();
}