public void produce(int data) throws java.lang.InterruptedException {
    synchronized(queue) {
        while (isQueueFull()) {
            log("Queue is full %s is waiting , size\n", java.lang.Thread.currentThread().getName(), queue.size());
            queue.wait();
        } 
        queue.add(data);
        queue.notifyAll();
    }
}