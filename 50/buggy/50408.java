public boolean closeWhenPossible() throws java.io.IOException {
    doClose = true;
    if ((readingCount.get()) == 0) {
        close();
    }
    return closed.get();
}