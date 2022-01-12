public java.lang.Integer consume() throws java.lang.InterruptedException {
    java.lang.Integer value;
    synchronized(queue) {
        while (queue.isEmpty()) {
            log("Queue is empty %s is waiting.\n", java.lang.Thread.currentThread().getName());
            queue.wait();
        } 
        value = queue.remove();
        queue.notifyAll();
    }
    return value;
}