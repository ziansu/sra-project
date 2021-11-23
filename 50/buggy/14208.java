@java.lang.Override
public void call() {
    pendingAckQueue.add(ack);
    metrics.incrementPendingAckCounter();
    metrics.incrementOutgoingMessageCounter(message.getClass(), 1);
    if (closed.get()) {
        drainPendingAckQueue();
    }
}