@java.lang.Override
public void flushOutgoingBatches(boolean isLastBatch, boolean schemaChanged) throws java.io.IOException {
    for (org.apache.drill.exec.physical.impl.partitionsender.PartitionerTemplate.OutgoingRecordBatch batch : outgoingBatches) {
        org.apache.drill.exec.physical.impl.partitionsender.PartitionerTemplate.logger.debug("Attempting to flush all outgoing batches");
        if (isLastBatch) {
            batch.setIsLast();
        }
        batch.flush(schemaChanged);
        if (schemaChanged) {
            batch.resetBatch();
            batch.initializeBatch();
        }
    }
}