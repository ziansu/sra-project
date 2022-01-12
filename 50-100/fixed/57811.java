public void timerInterrupt() {
    long currentTime = nachos.threads.Machine.timer().getTime();
    while (!(waitQueue.isEmpty())) {
        nachos.threads.PriorThread priorThread = waitQueue.peek();
        if ((priorThread.priority) <= currentTime) {
            waitQueue.poll();
            priorThread.thread.ready();
        }else {
            break;
        }
    } 
    nachos.threads.KThread.currentThread().yield();
}