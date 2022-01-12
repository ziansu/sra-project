protected org.eclipse.californium.core.network.stack.Block1BlockwiseStatus getInboundBlock1Status(final org.eclipse.californium.core.network.stack.KeyUri key, final org.eclipse.californium.core.network.Exchange exchange, final org.eclipse.californium.core.coap.Request request) {
    synchronized(block1Transfers) {
        org.eclipse.californium.core.network.stack.Block1BlockwiseStatus status = block1Transfers.get(key);
        if (status == null) {
            status = org.eclipse.californium.core.network.stack.Block1BlockwiseStatus.forInboundRequest(exchange, request, maxResourceBodySize);
            block1Transfers.put(key, status);
            org.eclipse.californium.core.network.stack.BlockwiseLayer.LOGGER.log(java.util.logging.Level.FINE, "created tracker for inbound block1 transfer {0}, transfers in progress: {1}", new java.lang.Object[]{ status , block1Transfers.size() });
        }
        prepareBlock1Cleanup(status, key);
        return status;
    }
}