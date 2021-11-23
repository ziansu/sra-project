public void connectToPeerViaMasterServer(java.util.UUID peerToConnect) {
    masterServer.addToSendQue(net.corpwar.lib.corpnet.util.SerializationUtils.getInstance().serialize(new net.corpwar.lib.corpnet.ConnectToPeer(peerToConnect)), NetworkSendType.PEER_DATA);
}