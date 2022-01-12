public boolean tryEnter() throws java.lang.InterruptedException {
    lock.lock();
    try {
        retVal = $missing$;
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