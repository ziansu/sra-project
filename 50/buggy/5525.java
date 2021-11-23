@java.lang.Override
protected void finalize() throws java.io.IOException {
    if ((!(closed)) && ((raf) != null)) {
        close();
    }
}