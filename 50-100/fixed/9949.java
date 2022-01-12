private static void connectToPeer(java.lang.String peerName, int peerPort) {
    try {
        java.rmi.registry.Registry theirReg = java.rmi.registry.LocateRegistry.getRegistry("localhost", peerPort);
        Peer.boundPeerStub = ((PeerInterface) (theirReg.lookup(peerName)));
        Peer.peerStubs.put(peerName, Peer.boundPeerStub);
        java.lang.System.out.println(("Found peer " + peerName));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}