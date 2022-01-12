protected static org.eclipse.californium.core.network.stack.KeyUri getKey(final org.eclipse.californium.core.network.Exchange exchange, final org.eclipse.californium.core.coap.Request request) {
    if (exchange.isOfLocalOrigin()) {
        return org.eclipse.californium.core.network.stack.KeyUri.fromOutboundRequest(request);
    }else {
        return org.eclipse.californium.core.network.stack.KeyUri.fromInboundRequest(request);
    }
}