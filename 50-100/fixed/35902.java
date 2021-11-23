void onTransactionCommitted(final org.opendaylight.controller.cluster.access.concepts.TransactionIdentifier txId) {
    final org.opendaylight.controller.cluster.datastore.FrontendHistoryMetadataBuilder history = getHistory(txId);
    if (history != null) {
        history.onTransactionCommitted(txId);
        org.opendaylight.controller.cluster.datastore.FrontendClientMetadataBuilder.LOG.debug("{}: Aborted transaction {}", shardName, txId);
    }else {
        org.opendaylight.controller.cluster.datastore.FrontendClientMetadataBuilder.LOG.warn("{}: Unknown history for commited transaction {}, ignoring", shardName, txId);
    }
}