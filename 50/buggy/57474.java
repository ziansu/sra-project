void clear(io.reactivex.internal.queue.SpscLinkedArrayQueue<?> q) {
    synchronized(this) {
        java.util.Arrays.fill(latest, null);
    }
    q.clear();
}