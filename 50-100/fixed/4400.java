public void sleep() {
    nachos.threads.Lib.assertTrue(conditionLock.isHeldByCurrentThread());
    boolean intStatus = nachos.threads.Machine.interrupt().disable();
    waitForCondQueue.add(nachos.threads.KThread.currentThread());
    conditionLock.release();
    nachos.threads.KThread.sleep();
    conditionLock.acquire();
    nachos.threads.Machine.interrupt().restore(intStatus);
}