private boolean writeToQueue(final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> buffer, final E e, final long index, final int offset) {
    org.jctools.queues.atomic.SpscUnboundedAtomicArrayQueue.soElement(buffer, offset, e);
    soProducerIndex((index + 1));
    return true;
}