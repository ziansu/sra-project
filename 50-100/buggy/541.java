public static <E> int blockingDrain(java.util.concurrent.BlockingQueue<E> queue, java.util.Collection<? super E> buffer) {
    com.google.common.base.Preconditions.checkNotNull(buffer);
    int added = queue.drainTo(buffer);
    try {
        if (added == 0) {
            buffer.add(queue.take());
            added += queue.drainTo(buffer);
            ++added;
        }
    } catch (java.lang.InterruptedException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
    return added;
}