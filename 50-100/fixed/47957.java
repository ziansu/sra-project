private final boolean outputToBatchPrev(org.apache.drill.exec.physical.impl.aggregate.InternalBatch b1, int inIndex, int outIndex) {
    assert (outputCount) < (org.apache.drill.exec.physical.impl.aggregate.StreamingAggTemplate.OUTPUT_BATCH_SIZE) : "Outgoing RecordBatch is not flushed. It reached its max capacity in the last update";
    outputRecordKeysPrev(b1, inIndex, outIndex);
    outputRecordValues(outIndex);
    resetValues();
    (outputCount)++;
    addedRecordCount = 0;
    return (outputCount) == (org.apache.drill.exec.physical.impl.aggregate.StreamingAggTemplate.OUTPUT_BATCH_SIZE);
}