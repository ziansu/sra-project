@java.lang.Override
public T poll() {
    long l = (consumedSeq.get()) + 1;
    if (l > (knownPublishedSeq)) {
        updatePublishedSequence();
    }
    if (l <= (knownPublishedSeq)) {
        com.ebay.jetstream.util.disruptor.SingleConsumerDisruptorQueue.Event<T> eventHolder = ringBuffer.get(l);
        T t = eventHolder.removeValue();
        consumedSeq.incrementAndGet();
        return t;
    }
    return null;
}