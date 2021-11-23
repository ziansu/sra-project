public static com.hazelcast.client.impl.protocol.ClientMessage encode(com.hazelcast.client.impl.protocol.parameters.MemberImpl member, com.hazelcast.cluster.client.MemberAttributeChange memberAttributeChange) {
    final int requiredDataSize = com.hazelcast.client.impl.protocol.parameters.MemberAttributeChangeResultParameters.calculateDataSize(member, memberAttributeChange);
    com.hazelcast.client.impl.protocol.ClientMessage clientMessage = com.hazelcast.client.impl.protocol.ClientMessage.createForEncode(requiredDataSize);
    clientMessage.setMessageType(com.hazelcast.client.impl.protocol.parameters.MemberAttributeChangeResultParameters.TYPE.id());
    com.hazelcast.client.impl.protocol.parameters.MemberCodec.encode(member, clientMessage);
    com.hazelcast.client.impl.protocol.parameters.MemberAttributeChangeCodec.encode(memberAttributeChange, clientMessage);
    clientMessage.addFlag(ClientMessage.LISTENER_EVENT_FLAG);
    clientMessage.updateFrameLength();
    return clientMessage;
}