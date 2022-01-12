public void timerInterrupt() {
    while (!(suspendedQueue.isEmpty())) {
        if ((suspendedQueue.peek().returnTime) < (nachos.threads.Machine.timer().getTime())) {
            boolean intStatus = nachos.threads.Machine.interrupt().disable();
            suspendedQueue.poll().thread.ready();
            nachos.threads.Machine.interrupt().restore(intStatus);
        }
    } 
    nachos.threads.KThread.yield();
}