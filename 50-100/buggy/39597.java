public void sendMessage(org.elasticsearch.common.bytes.BytesReference reference, org.elasticsearch.action.ActionListener<org.elasticsearch.transport.nio.NioChannel> listener) {
    org.elasticsearch.transport.nio.WriteOperation writeOperation = new org.elasticsearch.transport.nio.WriteOperation(channel, reference, listener);
    if ((selector.onThread()) == false) {
        selector.queueWrite(writeOperation);
        return ;
    }
    selector.queueWriteInChannelBuffer(writeOperation);
    queueWriteOperations(writeOperation);
}