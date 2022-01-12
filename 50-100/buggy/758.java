private org.eclipse.californium.core.network.stack.Block1BlockwiseStatus resetInboundBlock1Status(final org.eclipse.californium.core.network.stack.KeyUri key, final org.eclipse.californium.core.network.Exchange exchange, final org.eclipse.californium.core.coap.Request request) {
    synchronized(block1Transfers) {
        org.eclipse.californium.core.network.stack.Block1BlockwiseStatus removedStatus = block1Transfers.remove(key);
        org.eclipse.californium.core.network.stack.BlockwiseLayer.LOGGER.log(java.util.logging.Level.WARNING, "inbound block1 transfer reset at {0} by peer: {1}", new java.lang.Object[]{ removedStatus , request });
        return getInboundBlock1Status(key, exchange, request);
    }
}