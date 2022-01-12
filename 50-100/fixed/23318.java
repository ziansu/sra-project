@java.lang.Override
public void fetchChunk(long streamId, int chunkIndex, org.apache.spark.network.client.ChunkReceivedCallback callback) {
    logger.debug("Sending fetch chunk request {} to {}", chunkIndex, uri);
    final org.apache.spark.network.protocol.StreamChunkId streamChunkId = new org.apache.spark.network.protocol.StreamChunkId(streamId, chunkIndex);
    context.write(new org.apache.spark.network.rdma.RdmaMessage(new org.apache.spark.network.protocol.ChunkFetchRequest(streamChunkId)), streamChunkId, callback);
}