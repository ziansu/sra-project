@com.google.common.annotations.VisibleForTesting
synchronized void operationComplete(long operationSequenceId) {
    lastOperationChange = java.lang.System.currentTimeMillis();
    java.lang.Long heapSize = pendingOperationsWithSize.remove(operationSequenceId);
    if (heapSize != null) {
        currentWriteBufferSize -= heapSize;
        notifyAll();
    }else {
        com.google.cloud.bigtable.hbase.BigtableBufferedMutator.LOG.warn(("An operation completion was recieved multiple times. Your operations completed." + " Please notify Google that this occurred."));
    }
}