private void rollbackStorageTx() throws java.io.IOException {
    if (((writeAheadLog) == null) || ((transaction.get()) == null))
        return ;
    
    atomicOperationsManager.endAtomicOperation(true);
    assert (atomicOperationsManager.getCurrentOperation()) == null;
}