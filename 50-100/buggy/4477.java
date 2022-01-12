public void waitUntil(long x) {
    nachos.threads.Machine.interrupt().disable();
    if (x <= 0) {
        return ;
    }
    long wakeTime = (nachos.threads.Machine.timer().getTime()) + x;
    nachos.threads.KThread.currentThread().waitTime = wakeTime;
    java.lang.System.out.println(((nachos.threads.KThread.currentThread().waitTime) - x));
    KThread.waitQ.push(nachos.threads.KThread.currentThread());
    nachos.threads.KThread.sleep();
    nachos.threads.Machine.interrupt().enable();
}