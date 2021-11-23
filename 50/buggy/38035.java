public synchronized int numPeersDone() {
    int cnt = 0;
    for (com.networking.model.Peer p : peers)
        if (p.hasCompleteFile())
            ++cnt;
        
    
    return cnt;
}