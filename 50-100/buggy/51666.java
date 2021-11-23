@java.lang.Override
public long sendRpc(java.nio.ByteBuffer message, final org.apache.spark.network.client.RpcResponseCallback callback) {
    logger.trace("Sending RPC to {}:{}", host, port);
    final long requestId = java.lang.Math.abs(java.util.UUID.randomUUID().getLeastSignificantBits());
    context.write(new org.apache.spark.network.rdma.RdmaMessage(new org.apache.spark.network.protocol.RpcRequest(requestId, new org.apache.spark.network.buffer.NioManagedBuffer(message)), requestId), callback);
    return requestId;
}