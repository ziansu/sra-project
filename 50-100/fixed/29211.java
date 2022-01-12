public void close() {
    if (!(isClosed())) {
        closed = true;
        if (((buffer) != null) && ((buffer.readableBytes()) == 0)) {
            buffer.release();
            buffer = null;
        }
        commitToSink(true, true);
    }
}