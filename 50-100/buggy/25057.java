@java.lang.Override
public void run() {
    bitverify.network.proto.MessageProto.GetPeers getPeers = MessageProto.GetPeers.newBuilder().build();
    bitverify.network.proto.MessageProto.Message message = MessageProto.Message.newBuilder().setType(MessageProto.Message.Type.GETPEERS).setGetPeers(getPeers).build();
    java.lang.System.out.println(("Registering peers future " + (this)));
    bus.register(this);
    if (!(peer.send(message))) {
        java.lang.System.out.println(("unregistering peers future " + (this)));
        bus.unregister(this);
        resultLatch.countDown();
    }
}