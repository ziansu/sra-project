public java.lang.Integer consume() throws java.lang.InterruptedException {
    if (queue.isEmpty()) {
        synchronized(queue) {
            log("Queue is empty %s is waiting.\n", java.lang.Thread.currentThread().getName());
            queue.wait();
        }
    }
    java.lang.Integer value;
    synchronized(queue) {
        value = queue.remove();
        queue.notifyAll();
    }
    return value;
}