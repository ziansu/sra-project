public void waitUntil(long x) {
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    long wakeTime = (nachos.threads.Machine.timer().getTime()) + x;
    queue.put(wakeTime, nachos.threads.KThread.currentThread());
    nachos.threads.KThread.sleep();
    nachos.threads.Machine.interrupt().restore(intStatus);
}