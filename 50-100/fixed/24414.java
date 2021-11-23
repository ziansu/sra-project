private void sendRequestIfNeeded(int downstreamIdx) {
    int size = bucketBuilder.size(downstreamIdx);
    if ((size >= (io.crate.Constants.PAGE_SIZE)) || ((remainingUpstreams.get()) <= 0)) {
        io.crate.executor.transport.distributed.DistributingDownstream.Downstream downstream = downstreams[downstreamIdx];
        downstream.bucketQueue.add(bucketBuilder.build(downstreamIdx));
        downstream.sendRequest(((remainingUpstreams.get()) <= 0));
    }
}