protected org.eclipse.californium.core.network.stack.KeyUri addRandomAccessBlock2Status(final org.eclipse.californium.core.network.Exchange exchange, final org.eclipse.californium.core.coap.Request request) {
    org.eclipse.californium.core.network.stack.KeyUri key = org.eclipse.californium.core.network.stack.BlockwiseLayer.getKey(exchange, request);
    synchronized(block2Transfers) {
        org.eclipse.californium.core.network.stack.Block2BlockwiseStatus status = org.eclipse.californium.core.network.stack.Block2BlockwiseStatus.forRandomAccessRequest(exchange, request);
        block2Transfers.put(key, status);
        addBlock2CleanUpObserver(request, key);
        org.eclipse.californium.core.network.stack.BlockwiseLayer.LOGGER.log(java.util.logging.Level.FINE, "created tracker for random access block2 retrieval {0}, transfers in progress: {1}", new java.lang.Object[]{ status , block2Transfers.size() });
        return key;
    }
}