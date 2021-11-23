private java.util.Set<simpledb.TransactionId> getSharedLockList(simpledb.PageId pageId) {
    if ((sharedLocks.get(pageId)) == null)
        sharedLocks.put(pageId, new java.util.HashSet<simpledb.TransactionId>());
    
    return sharedLocks.get(pageId);
}