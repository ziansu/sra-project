public boolean withdraw(java.lang.String userId, int value) {
    if (value < 0)
        return false;
    
    RWLock.writeLock().lock();
    int balance = getOrZero(userId);
    if ((balance - value) < 0)
        return false;
    
    try {
        balances.put(userId, (balance - value));
        return true;
    } finally {
        writeLog("WITHDRAW", userId, "", value);
        RWLock.writeLock().unlock();
    }
}