void clear(io.reactivex.internal.queue.SpscLinkedArrayQueue<?> q) {
    synchronized(this) {
        latest = null;
    }
    q.clear();
}