protected boolean requiresBlockwise(final org.eclipse.californium.core.network.Exchange exchange, final org.eclipse.californium.core.coap.Response response, final org.eclipse.californium.core.coap.BlockOption requestBlock2) {
    boolean blockwiseRequired = (response.getPayloadSize()) > (maxMessageSize);
    if (requestBlock2 != null) {
        blockwiseRequired = blockwiseRequired || ((response.getPayloadSize()) > (requestBlock2.getSize()));
    }
    if (blockwiseRequired) {
        org.eclipse.californium.core.network.stack.BlockwiseLayer.LOGGER.log(java.util.logging.Level.FINE, "response body [{0}/{1}] requires blockwise transfer", new java.lang.Object[]{ response.getPayloadSize() , maxMessageSize });
    }
    return blockwiseRequired;
}