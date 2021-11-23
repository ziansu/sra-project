public boolean deposit(java.lang.String userId, int value) {
    if (value < 0)
        return false;
    
    RWLock.writeLock().lock();
    try {
        int balance = getOrZero(userId);
        balances.put(userId, (balance + value));
        return true;
    } finally {
        writeLog("DEPOSIT", userId, "", value);
        RWLock.writeLock().unlock();
    }
}