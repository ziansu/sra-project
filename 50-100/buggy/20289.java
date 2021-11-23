protected void joinCoreThreads() {
    try {
        networkThread_.join();
        dispatcherThread_.join();
        if (isRestEnabled_) {
            restThread_.join();
        }
        msgReceivingCheckerThread_.join();
    } catch (java.lang.InterruptedException exception) {
        org.nebulostore.peers.Peer.logger_.fatal("Interrupted");
        return ;
    }
}