@java.lang.Override
public void onEvent(com.orchid.ring.RingElement event, long sequence, boolean endOfBatch) throws java.lang.Exception {
    publisher.send(event, event.userID);
    assertNotNull(event.message);
    assertNotNull(event.userID);
    items.add(event.message.getIntroduce().getName());
    if ((items.size()) == (messagesCount)) {
        try {
            lock.lock();
            done.signal();
        } finally {
            lock.unlock();
        }
    }
}