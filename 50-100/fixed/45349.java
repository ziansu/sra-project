public void run() {
    buffer = new byte[256];
    for (PeerInfo peer : Peer.peerList) {
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