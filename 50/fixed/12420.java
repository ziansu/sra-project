void close(boolean error) {
    if (!(isContinuation)) {
        flush(error);
    }
}