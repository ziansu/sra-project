public void run() {
    Peer.disconnect();
    for (PeerInfo peer : Peer.peerList) {
        buffer = new byte[256];
        buffer = message.getBytes();
        leavePacket = new java.net.DatagramPacket(buffer, 0, buffer.length, peer.hostIP, peer.portNum);
        try {
            dataSocket.send(leavePacket);
        } catch (java.io.IOException e) {
            java.lang.System.out.println(("Error:" + e));
        }
        dataSocket.close();
    }
}