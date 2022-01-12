private static final void readMessageSet(java.lang.String topicName, int partition, io.netty.buffer.ByteBuf buffer, java.lang.Object state, clojure.lang.IFn onMessage) {
    while ((buffer.readableBytes()) > 12) {
        long offset = buffer.readLong();
        int messageByteSize = buffer.readInt();
        if ((messageByteSize > 10) && ((buffer.readableBytes()) >= messageByteSize))
            kafka_clj.util.Fetch.readMessage(topicName, partition, offset, buffer.readSlice(messageByteSize), state, onMessage);
        else
            break;
        
    } 
}