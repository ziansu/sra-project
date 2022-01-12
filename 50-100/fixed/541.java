public static <E> int blockingDrain(java.util.concurrent.BlockingQueue<E> queue, java.util.Collection<? super E> buffer) throws java.lang.InterruptedException {
    com.google.common.base.Preconditions.checkNotNull(buffer);
    int added = queue.drainTo(buffer);
    if (added == 0) {
        buffer.add(queue.take());
        added += queue.drainTo(buffer);
        ++added;
    }
    return added;
}