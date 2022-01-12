public boolean closeWhenPossible() throws java.io.IOException {
    doClose.set(true);
    if ((readingCount.get()) == 0) {
        close();
    }
    return closed.get();
}