void recursiveFunction(int nestIndex) {
    if (nestIndex != 5) {
        cz.jskrabal.example.ReentrantLockExample.REENTRANT_LOCK.lock();
        try {
            java.lang.System.out.println((((java.lang.Thread.currentThread().getName()) + " - ") + (cz.jskrabal.example.ReentrantLockExample.REENTRANT_LOCK.getHoldCount())));
            recursiveFunction((nestIndex + 1));
        } finally {
            cz.jskrabal.example.ReentrantLockExample.REENTRANT_LOCK.unlock();
        }
    }
}