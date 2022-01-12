public boolean deposit(java.lang.String userId, int value) {
    if (value < 0)
        return false;
    
    RWLock.writeLock().lock();
    try {
        int balance = getOrZero(userId);
        balances.put(userId, (balance + value));
        writeLog("DEPOSIT", userId, "", value);
        return true;
    } finally {
        RWLock.writeLock().unlock();
    }
}