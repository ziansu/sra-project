@java.lang.Override
public boolean prepare(long xid) throws java.rmi.RemoteException {
    if ((dieTime) == (DieTime.BEFORE_PREPARE)) {
        transaction.ResourceManagerImpl.dieNow();
    }
    if (xid < 0) {
        throw new transaction.exception.InvalidTransactionException(xid, "Xid must be positive.");
    }
    if (!(xids.contains(xid))) {
        throw new transaction.exception.InvalidTransactionException(xid, "No Such Xid.");
    }
    if ((dieTime) == (DieTime.AFTER_PREPARE))
        transaction.ResourceManagerImpl.dieNow();
    
    return true;
}