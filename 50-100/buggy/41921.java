private org.eclipse.californium.core.network.stack.Block2BlockwiseStatus getOutboundBlock2Status(final org.eclipse.californium.core.network.stack.KeyUri key, final org.eclipse.californium.core.network.Exchange exchange, final org.eclipse.californium.core.coap.Response response) {
    synchronized(block2Transfers) {
        org.eclipse.californium.core.network.stack.Block2BlockwiseStatus status = block2Transfers.get(key);
        if (status == null) {
            status = org.eclipse.californium.core.network.stack.Block2BlockwiseStatus.forOutboundResponse(exchange, response, preferredBlockSize);
            block2Transfers.put(key, status);
            org.eclipse.californium.core.network.stack.BlockwiseLayer.LOGGER.log(java.util.logging.Level.FINE, "created tracker for outbound block2 transfer {0}, transfers in progress: {1}", new java.lang.Object[]{ status , block2Transfers.size() });
        }
        prepareBlock2Cleanup(status, key);
        return status;
    }
}