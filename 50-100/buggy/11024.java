public synchronized void releaseAllLocks(simpledb.TransactionId tid, boolean commit) throws java.io.IOException {
    java.util.HashSet<simpledb.PageId> pids = this.getAllPagesByTid(tid);
    java.util.HashSet<simpledb.PageId> cloneSet = ((java.util.HashSet<simpledb.PageId>) (pids.clone()));
    for (simpledb.PageId pid : cloneSet) {
        this.releaseLock(tid, pid);
    }
}