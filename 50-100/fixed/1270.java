public synchronized com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer.WebsocketSession putOpenSession(java.net.InetAddress identity, javax.websocket.Session session) {
    com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer.WebsocketSession openSession = openSessions.get(identity);
    if (openSession != null) {
        if (openSession.session.isOpen()) {
            return null;
        }
        openSessions.remove(identity);
    }
    com.shuffle.p2p.WebsocketServerChannel.WebsocketPeer peer;
    try {
        peer = peers.get(identity).setSession(session);
    } catch (java.io.IOException e) {
        return null;
    }
    openSessions.put(identity, peer.currentSession);
    return peer.currentSession;
}