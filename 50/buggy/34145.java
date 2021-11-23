public void registerToMasterServer() {
    masterServer.addToSendQue(net.corpwar.lib.corpnet.util.SerializationUtils.getInstance().serialize(new net.corpwar.lib.corpnet.RegisterPeer()), NetworkSendType.PEER_DATA);
}