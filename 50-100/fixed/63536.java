@java.lang.Override
public void acquireLock(io.hops.transaction.lock.TransactionLocks locks) throws java.io.IOException {
    io.hops.transaction.lock.LockFactory lf = io.hops.transaction.lock.LockFactory.getInstance();
    locks.add(lf.getINodeLock((!(dir.isQuotaEnabled())), nameNode, INodeLockType.WRITE_ON_TARGET_AND_PARENT, INodeResolveType.PATH, resolvedLink, src));
}