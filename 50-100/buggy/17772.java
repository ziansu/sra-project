public void removePeer(java.lang.String leavingIP, java.lang.String leavingPort) {
    for (PeerInfo peer : Peer.peerList) {
        if ((peer.hostIP.toString().equals(leavingIP)) && ((peer.portNum) == (java.lang.Integer.parseInt(leavingPort)))) {
            Peer.peerList.remove(peer);
            java.lang.System.out.println("Peer has left the chat");
        }
    }
}