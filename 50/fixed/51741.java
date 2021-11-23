public void close() {
    status = STATUS.CLOSED;
    if ((workQueueProcessor) != null) {
        workQueueProcessor.close();
    }
}