private static org.eclipse.californium.core.network.stack.KeyUri getKey(final org.eclipse.californium.core.network.Exchange exchange, final org.eclipse.californium.core.coap.Response response) {
    if (exchange.isOfLocalOrigin()) {
        return org.eclipse.californium.core.network.stack.KeyUri.fromInboundResponse(exchange.getRequest().getURI(), response);
    }else {
        return org.eclipse.californium.core.network.stack.KeyUri.fromOutboundResponse(exchange.getRequest().getURI(), response);
    }
}