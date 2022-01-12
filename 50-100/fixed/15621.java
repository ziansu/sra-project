public boolean tryEnter() throws java.lang.InterruptedException {
    boolean retVal;
    lock.lock();
    try {
        if (isClear) {
            isClear = false;
            retVal = true;
        }else {
            retVal = false;
        }
    } finally {
        lock.unlock();
    }
    return retVal;
}