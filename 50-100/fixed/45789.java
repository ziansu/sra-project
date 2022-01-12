private synchronized void fail() {
    current = (++(current)) % (tries.length);
    long firstFail = tries[current];
    long now = tries[current] = java.lang.System.currentTimeMillis();
    if (firstFail == 0)
        return ;
    
    if ((now - firstFail) < (afterFailedLoginsWithin))
        blockedUntil = now + (blockFor);
    
}