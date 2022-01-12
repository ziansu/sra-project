protected boolean requiresBlockwise(final org.eclipse.californium.core.coap.Request request) {
    boolean blockwiseRequired = false;
    if (((request.getCode()) == (org.eclipse.californium.core.coap.CoAP.Code.PUT)) || ((request.getCode()) == (org.eclipse.californium.core.coap.CoAP.Code.POST))) {
        blockwiseRequired = (request.getPayloadSize()) > (maxMessageSize);
    }
    if (blockwiseRequired) {
        org.eclipse.californium.core.network.stack.BlockwiseLayer.LOGGER.log(java.util.logging.Level.FINE, "request body [{0}/{1}] requires blockwise transfer", new java.lang.Object[]{ request.getPayloadSize() , maxMessageSize });
    }
    return blockwiseRequired;
}