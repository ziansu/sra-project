private java.util.ArrayList<simpledb.TransactionId> getSharedLockList(simpledb.PageId pageId) {
    if ((sharedLocks.get(pageId)) == null)
        sharedLocks.put(pageId, new java.util.ArrayList<simpledb.TransactionId>());
    
    return sharedLocks.get(pageId);
}