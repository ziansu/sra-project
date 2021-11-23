public void flush() throws java.io.IOException {
    out.flush();
    if (!(keepAlive)) {
        out.close();
    }
}