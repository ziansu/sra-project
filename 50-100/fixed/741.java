public void waitForAccess(nachos.threads.PriorityScheduler.PriorityQueue waitQueue) {
    waitQueue.waitingQueue.add(this);
    waitQueue.setChange();
    Waiting = waitQueue;
    if ((Holding.indexOf(waitQueue)) != (-1)) {
        Holding.remove(waitQueue);
        this.setChange();
        waitQueue.holder = null;
    }
}