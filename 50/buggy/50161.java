@java.lang.Override
public boolean offer(E e) {
    synchronized(queue) {
        if ((queue.size()) < (limit)) {
            queue.poll();
        }
        return queue.offer(e);
    }
}