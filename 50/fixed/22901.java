public games.strategy.net.INode getLastSender() {
    synchronized(lock) {
        waitForMessage();
        return senders.get(0);
    }
}