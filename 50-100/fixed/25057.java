@java.lang.Override
public void run() {
    bitverify.network.proto.MessageProto.GetPeers getPeers = MessageProto.GetPeers.newBuilder().build();
    bitverify.network.proto.MessageProto.Message message = MessageProto.Message.newBuilder().setType(MessageProto.Message.Type.GETPEERS).setGetPeers(getPeers).build();
    bus.register(this);
    if (!(peer.send(message))) {
        bus.unregister(this);
        resultLatch.countDown();
    }
}