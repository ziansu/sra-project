private void closeWithError(java.lang.Exception e, boolean sendToConsumer) {
    if (status.isClosed())
        return ;
    
    setStatus(io.datakernel.stream.CLOSED_WITH_ERROR);
    error = e;
    downstreamDataReceiver = new io.datakernel.stream.AbstractStreamProducer.DataReceiverAfterClose<>();
    io.datakernel.stream.AbstractStreamProducer.logger.error("StreamProducer {} closed with error {}", this, error.toString());
    if (sendToConsumer && ((downstreamConsumer) != null)) {
        downstreamConsumer.onProducerError(e);
    }
    onError(e);
    doCleanup();
}