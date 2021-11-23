private E newBufferPoll(E[] nextBuffer, final long index) {
    final long offsetInNew = newBufferAndOffset(nextBuffer, index);
    final E n = org.jctools.queues.MpscGrowableArrayQueue.lvElement(nextBuffer, offsetInNew);
    if (null == n) {
        throw new java.lang.IllegalStateException("new buffer must have at least one element");
    }
    soConsumerIndex((index + 2));
    org.jctools.queues.MpscGrowableArrayQueue.soElement(nextBuffer, offsetInNew, null);
    return n;
}