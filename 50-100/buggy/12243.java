public synchronized long registerOperationWithHeapSize(long heapSize) throws java.lang.InterruptedException {
    long operationId = ++(operationSequenceGenerator);
    while (((currentWriteBufferSize) >= (maxHeapSize)) || ((pendingOperationsWithSize.size()) >= (maxInFlightRpcs))) {
        wait(com.google.cloud.bigtable.hbase.BigtableBufferedMutator.WAIT_MILLIS);
    } 
    lastOperationChange = java.lang.System.currentTimeMillis();
    pendingOperationsWithSize.put(operationId, heapSize);
    currentWriteBufferSize += heapSize;
    return operationId;
}