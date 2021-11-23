public void close() {
    status = STATUS.CLOSED;
    workQueueProcessor.close();
}