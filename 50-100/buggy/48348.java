public void handleExpectedError(com.quantiply.samza.task.IncomingMessageEnvelope envelope, java.lang.Exception e) throws java.lang.Exception {
    if (logger.isInfoEnabled()) {
        logger.error("Error processing message", e);
    }
    com.quantiply.samza.task.BaseTask.StreamMsgHandler handler = getStreamMsgHandler(envelope);
    errorHandler.handleExpectedError(envelope, e);
    handler.metrics.dropped.mark();
}