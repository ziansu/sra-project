@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public final E peek() {
    final E[] buffer = consumerBuffer;
    final long index = consumerIndex;
    final long mask = consumerMask;
    final long offset = org.jctools.queues.MpscGrowableArrayQueue.calcElementOffset(index, mask);
    final java.lang.Object e = org.jctools.queues.MpscGrowableArrayQueue.lvElement(buffer, offset);
    if (e == (org.jctools.queues.MpscGrowableArrayQueue.JUMP)) {
        return newBufferPeek(getNextBuffer(buffer, mask), index);
    }
    return ((E) (e));
}