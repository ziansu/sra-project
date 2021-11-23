private void rollbackStorageTx() throws java.io.IOException {
    if (((writeAheadLog) == null) || ((transaction.get()) == null))
        return ;
    
    final com.orientechnologies.orient.core.storage.impl.local.paginated.atomicoperations.OAtomicOperation operation = atomicOperationsManager.endAtomicOperation(true);
    assert (atomicOperationsManager.getCurrentOperation()) == null;
    final java.util.List<com.orientechnologies.orient.core.storage.impl.local.OLogSequenceNumber> operationUnit = readOperationUnit(operation.getStartLSN(), operation.getOperationUnitId());
    undoOperation(operationUnit);
}