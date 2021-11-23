public sawtooth.sdk.client.Future send(sawtooth.sdk.protobuf.Message.MessageType destination, com.google.protobuf.ByteString contents) {
    sawtooth.sdk.protobuf.Message message = sawtooth.sdk.protobuf.Message.newBuilder().setCorrelationId(this.generateId()).setMessageType(destination).setContent(contents).build();
    sawtooth.sdk.client.FutureByteString future = new sawtooth.sdk.client.FutureByteString(message.getCorrelationId());
    this.futureHashMap.put(message.getCorrelationId(), future);
    this.sendReceiveThread.sendMessage(message);
    return future;
}