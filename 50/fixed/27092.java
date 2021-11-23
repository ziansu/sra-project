public void acquire(nachos.threads.PriorityScheduler.PriorityQueue waitQueue) {
    Holding.add(waitQueue);
    if (waitQueue == (Waiting)) {
        waitQueue.waitingQueue.remove(this);
        Waiting = null;
    }
    setChange();
}