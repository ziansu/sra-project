public void sendRequest(boolean isLast) {
    io.crate.core.collections.Bucket bucket = bucketQueue.poll();
    io.crate.executor.transport.distributed.DistributedResultRequest request = new io.crate.executor.transport.distributed.DistributedResultRequest(jobId, targetExecutionNodeId, bucketIdx, streamers, (bucket != null ? bucket : io.crate.core.collections.Bucket.EMPTY), isLast);
    synchronized(this.requestQueue) {
        if (!(requestPending.compareAndSet(false, true))) {
            requestQueue.add(request);
            return ;
        }
    }
    sendRequest(request);
}