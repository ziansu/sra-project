public void sleep() {
    nachos.threads.Lib.assertTrue(conditionLock.isHeldByCurrentThread());
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    waitForCondQueue.add(nachos.threads.KThread.currentThread());
    conditionLock.release();
    nachos.threads.KThread.sleep();
    nachos.threads.Machine.interrupt().restore(intStatus);
    conditionLock.acquire();
}