@java.lang.Override
public long beginTransaction() {
    txContext.reset();
    sm.readLock(this);
    txId = sm.getNextTxId();
    return txId;
}