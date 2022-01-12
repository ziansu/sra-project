public boolean withdraw(java.lang.String userId, int value) {
    if (value < 0)
        return false;
    
    RWLock.writeLock().lock();
    try {
        int balance = getOrZero(userId);
        if ((balance - value) < 0)
            return false;
        
        balances.put(userId, (balance - value));
        writeLog("WITHDRAW", userId, "", value);
        return true;
    } finally {
        RWLock.writeLock().unlock();
    }
}