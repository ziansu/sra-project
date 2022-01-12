@java.lang.Override
public void onTransactionChainFailed(final org.opendaylight.controller.md.sal.common.api.data.TransactionChain<?, ?> chain, final org.opendaylight.controller.md.sal.common.api.data.AsyncTransaction<?, ?> transaction, final java.lang.Throwable cause) {
    synchronized(txLock) {
        if ((org.opendaylight.openflowplugin.impl.device.TransactionChainManager.TransactionChainManagerStatus.WORKING) == (transactionChainManagerStatus)) {
            org.opendaylight.openflowplugin.impl.device.TransactionChainManager.LOG.warn("Transaction chain failed, recreating chain due to ", cause);
            createTxChain(chain);
            wTx = null;
        }
    }
}