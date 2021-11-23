void close() {
    if (!(isContinuation)) {
        flush();
    }
}