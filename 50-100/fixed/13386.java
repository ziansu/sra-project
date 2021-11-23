@java.lang.Override
public void applyAugmentedRowsEvent(final com.booking.replication.augmenter.AugmentedRowsEvent augmentedRowsEvent, final com.booking.replication.pipeline.PipelineOrchestrator pipeline) {
    java.lang.String hbaseNamespace = getHBaseNamespace(pipeline);
    if (hbaseNamespace == null)
        return ;
    
    hbaseApplierWriter.pushToCurrentTaskBuffer(augmentedRowsEvent);
    long currentTime = java.lang.System.currentTimeMillis();
    long tDiff = currentTime - (timeOfLastFlush);
    boolean forceFlush = tDiff > (com.booking.replication.applier.HBaseApplier.BUFFER_FLUSH_INTERVAL);
    if (((hbaseApplierWriter.rowsBufferedInCurrentTask.get()) >= (com.booking.replication.applier.HBaseApplier.UUID_BUFFER_SIZE)) || forceFlush) {
        markAndSubmit();
    }
}