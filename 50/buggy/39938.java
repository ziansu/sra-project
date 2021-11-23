@java.lang.Override
public void stop() {
    manager.disconnect();
    synchronized(users) {
        for (ptwop.p2p.P2PUser u : users) {
            u.getBindedNPair().disconnect();
        }
        users.clear();
        pairUserMap.clear();
    }
}