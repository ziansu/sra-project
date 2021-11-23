void activateTransactionManager() {
    if (org.opendaylight.openflowplugin.impl.device.TransactionChainManager.LOG.isDebugEnabled()) {
        org.opendaylight.openflowplugin.impl.device.TransactionChainManager.LOG.debug("activateTransactionManager for node {} transaction submit is set to {}", this.nodeId, submitIsEnabled);
    }
    synchronized(txLock) {
        if ((org.opendaylight.openflowplugin.impl.device.TransactionChainManager.TransactionChainManagerStatus.SLEEPING) == (transactionChainManagerStatus)) {
            com.google.common.base.Preconditions.checkState(((txChainFactory) == null), "TxChainFactory survive last close.");
            com.google.common.base.Preconditions.checkState(((wTx) == null), "We have some unexpected WriteTransaction.");
            this.transactionChainManagerStatus = org.opendaylight.openflowplugin.impl.device.TransactionChainManager.TransactionChainManagerStatus.WORKING;
            this.submitIsEnabled = false;
            this.initCommit = true;
            createTxChain(null);
        }
    }
}