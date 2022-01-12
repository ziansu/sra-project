void recursiveFunction(int nestIndex) {
    if (nestIndex != 5) {
        try {
            cz.jskrabal.example.ReentrantLockExample.REENTRANT_LOCK.lock();
            java.lang.System.out.println((((java.lang.Thread.currentThread().getName()) + " - ") + (cz.jskrabal.example.ReentrantLockExample.REENTRANT_LOCK.getHoldCount())));
            recursiveFunction((nestIndex + 1));
        } finally {
            cz.jskrabal.example.ReentrantLockExample.REENTRANT_LOCK.unlock();
        }
    }
}