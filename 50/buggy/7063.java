public void clearLastMessage() {
    synchronized(lock) {
        if (messages.isEmpty()) {
            waitForMessage();
        }
        messages.remove(0);
        senders.remove(0);
    }
}