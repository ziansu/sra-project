public org.neo4j.coreedge.catchup.CatchupResult tryCatchingUp(org.neo4j.coreedge.identity.MemberId from, org.neo4j.coreedge.identity.StoreId expectedStoreId, java.io.File storeDir) throws java.io.IOException, org.neo4j.coreedge.catchup.storecopy.StoreCopyFailedException {
    org.neo4j.kernel.impl.transaction.log.ReadOnlyTransactionIdStore transactionIdStore = new org.neo4j.kernel.impl.transaction.log.ReadOnlyTransactionIdStore(pageCache, storeDir);
    long lastCommittedTxId = transactionIdStore.getLastCommittedTransactionId();
    return pullTransactions(from, expectedStoreId, storeDir, lastCommittedTxId);
}