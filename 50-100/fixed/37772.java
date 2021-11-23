@java.lang.Override
public void acquireLock(io.hops.transaction.lock.TransactionLocks locks) throws java.io.IOException {
    io.hops.transaction.lock.LockFactory lf = io.hops.transaction.lock.LockFactory.getInstance();
    locks.add(lf.getINodeLock((!(dir.isQuotaEnabled())), nameNode, INodeLockType.WRITE, INodeResolveType.PATH, false, path)).add(lf.getSubTreeOpsLock(LockType.READ_COMMITTED, getSubTreeLockPathPrefix(path)));
}