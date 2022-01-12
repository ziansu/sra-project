@java.lang.Override
public void acquireLock(io.hops.transaction.lock.TransactionLocks locks) throws java.io.IOException {
    io.hops.transaction.lock.LockFactory lf = io.hops.transaction.lock.LockFactory.getInstance();
    locks.add(lf.getIndividualINodeLock(INodeLockType.WRITE, inodeIdentifier, true)).add(lf.getLeaseLock(LockType.READ)).add(lf.getLeasePathLock(LockType.READ_COMMITTED)).add(lf.getBlockLock(oldBlock.getBlockId(), inodeIdentifier)).add(lf.getBlockRelated(BLK.UC));
}