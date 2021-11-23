public void incrementSendCounter() {
    if ((++(sendCounter)) == 2) {
        server.HostedGame.LOCK.lock();
        try {
            server.HostedGame.MOVES_SENT.signal();
        } finally {
            server.HostedGame.LOCK.unlock();
        }
    }
}