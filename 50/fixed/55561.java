public void close() throws java.io.IOException {
    flush();
    _out.close();
}