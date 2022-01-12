public void commit(javax.transaction.xa.Xid xid, boolean onePhase, java.lang.Runnable callback) throws org.wso2.andes.kernel.AndesException, org.wso2.andes.kernel.dtx.UnknownDtxBranchException, org.wso2.andes.server.txn.IncorrectDtxStateException, org.wso2.andes.server.txn.RollbackOnlyDtxException, org.wso2.andes.server.txn.TimeoutDtxException {
    if (org.wso2.andes.server.txn.QpidDistributedTransaction.LOGGER.isDebugEnabled()) {
        org.wso2.andes.server.txn.QpidDistributedTransaction.LOGGER.debug(("Committing distributed transaction " + (java.util.Arrays.toString(xid.getGlobalTransactionId()))));
    }
    distributedTransaction.commit(xid, onePhase, callback);
}