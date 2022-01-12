public boolean put(java.lang.String userId, int value) {
    if (value < 0)
        return false;
    
    RWLock.writeLock().lock();
    try {
        balances.put(userId, value);
        return true;
    } finally {
        writeLog("PUT", userId, "", value);
        RWLock.writeLock().unlock();
    }
}