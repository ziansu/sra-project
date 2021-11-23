public void unwind() {
    if (!(evictSyncAgr))
        return ;
    
    if (!(busyLock.enterBusy()))
        return ;
    
    try {
        checkEvictionQueue();
    } finally {
        busyLock.leaveBusy();
    }
}