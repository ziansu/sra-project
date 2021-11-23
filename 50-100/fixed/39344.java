@java.lang.Override
public void completed(final org.eclipse.californium.core.network.Exchange exchange) {
    if ((exchange.getOrigin()) == (Exchange.Origin.LOCAL)) {
        org.eclipse.californium.core.network.Exchange.KeyToken idByToken = Exchange.KeyToken.fromOutboundMessage(exchange.getCurrentRequest());
        exchangeStore.remove(idByToken, exchange);
        if (!(exchange.getCurrentRequest().getOptions().hasObserve())) {
            exchangeStore.releaseToken(idByToken);
        }
    }else {
    }
}