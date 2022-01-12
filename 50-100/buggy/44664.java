public void sleep() {
    nachos.threads.Lib.assertTrue(conditionLock.isHeldByCurrentThread());
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    conditionLock.release();
    sleepingThreads.add(nachos.threads.KThread.currentThread());
    sleep();
    conditionLock.acquire();
    nachos.threads.Machine.interrupt().restore(intStatus);
}