public int numPeersDone() {
    int cnt = 0;
    synchronized(peers) {
        for (com.networking.model.Peer p : peers)
            if (p.hasCompleteFile())
                ++cnt;
            
        
    }
    return cnt;
}