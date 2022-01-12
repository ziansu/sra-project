@java.lang.Override
public synchronized void onMessage(java.lang.String message) {
    counter.incrementAndGet();
    receivedMessages.add(message);
}