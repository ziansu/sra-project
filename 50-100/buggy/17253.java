@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public E relaxedPeek() {
    if (false) {
        final E[] buffer = consumerBuffer;
        final long index = consumerIndex;
        final long mask = consumerMask;
        final long offset = org.jctools.queues.MpscChunkedArrayQueue.modifiedCalcElementOffset(index, mask);
        java.lang.Object e = org.jctools.queues.MpscChunkedArrayQueue.lvElement(buffer, offset);
        if (e == (org.jctools.queues.MpscChunkedArrayQueue.JUMP)) {
            return newBufferPeek(getNextBuffer(buffer, mask), index);
        }
        return ((E) (e));
    }
    return peek();
}