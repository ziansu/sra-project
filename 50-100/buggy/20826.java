@java.lang.Override
public org.apache.spark.network.buffer.ManagedBuffer next() {
    java.lang.String blockId = (("shuffle_" + (shuffleId)) + "_") + (new java.lang.String(mapIdAndReduceIds[index]));
    final org.apache.spark.network.buffer.ManagedBuffer block = blockManager.getBlockData(appId, execId, blockId);
    (index)++;
    metrics.blockTransferRateBytes.mark((block != null ? block.size() : 0));
    return block;
}