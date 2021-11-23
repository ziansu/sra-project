@java.lang.Override
public T poll() {
    long l = (consumedSeq.get()) + 1;
    if (l > (knownPublishedSeq)) {
        updatePublishedSequence();
    }
    if (l <= (knownPublishedSeq)) {
        com.ebay.jetstream.util.disruptor.SingleConsumerDisruptorQueue.Event<T> eventHolder = ringBuffer.get(l);
        consumedSeq.incrementAndGet();
        return eventHolder.removeValue();
    }
    return null;
}