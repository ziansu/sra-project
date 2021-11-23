protected void joinCoreThreads() {
    try {
        msgReceivingCheckerThread_.join();
        networkThread_.join();
        dispatcherThread_.join();
        if (isRestEnabled_) {
            restThread_.join();
        }
    } catch (java.lang.InterruptedException exception) {
        org.nebulostore.peers.Peer.logger_.fatal("Interrupted");
        return ;
    }
}