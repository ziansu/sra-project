private void sendRequest(final io.crate.executor.transport.distributed.DistributedResultRequest request) {
    if (io.crate.executor.transport.distributed.DistributingDownstream.LOGGER.isTraceEnabled()) {
        io.crate.executor.transport.distributed.DistributingDownstream.LOGGER.trace("[{}] sending distributing collect request to {}, isLast? {} ...", jobId.toString(), node, request.isLast());
    }
    try {
        transportDistributedResultAction.pushResult(node, request, this);
    } catch (java.lang.IllegalArgumentException e) {
        io.crate.executor.transport.distributed.DistributingDownstream.LOGGER.error(e.getMessage(), e);
        wantMore.set(false);
    }
}