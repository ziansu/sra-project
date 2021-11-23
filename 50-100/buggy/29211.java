public void close() {
    if (!(isClosed())) {
        if (((buffer) != null) && ((buffer.readableBytes()) == 0)) {
            buffer.release();
            buffer = null;
        }
        commitToSink(true, true);
        closed = true;
    }
}