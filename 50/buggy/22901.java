public games.strategy.net.INode getLastSender() {
    synchronized(lock) {
        if (messages.isEmpty()) {
            waitForMessage();
        }
        return senders.get(0);
    }
}