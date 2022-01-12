public void produce(int data) throws java.lang.InterruptedException {
    if (isQueueFull()) {
        synchronized(queue) {
            log("Queue is full %s is waiting , size\n", java.lang.Thread.currentThread().getName(), queue.size());
            queue.wait();
        }
    }
    synchronized(queue) {
        queue.add(data);
        queue.notifyAll();
    }
}