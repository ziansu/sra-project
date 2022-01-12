private void broadcastTraderState(int traderId, boolean isActive) {
    try {
        for (int peerId : rmiTable.keySet()) {
            if (((peerId != 0) && (peerId != (myId))) && (peerId != (anotherTraderId))) {
                PeerInterface p = getRemotePeerObj(peerId);
                p.recvTraderState(myId, traderId, isActive);
            }
        }
    } catch (java.rmi.RemoteException e) {
        java.lang.System.out.println(("Exception in broadcastTraderState(): " + (e.toString())));
    }
}