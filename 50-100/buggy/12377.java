public void sleep() {
    nachos.threads.Lib.assertTrue(conditionLock.isHeldByCurrentThread());
    waitForCondQueue.add(nachos.threads.KThread.currentThread());
    conditionLock.release();
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    nachos.threads.KThread.sleep();
    nachos.threads.Machine.interrupt().restore(intStatus);
    conditionLock.acquire();
}