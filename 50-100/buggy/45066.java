@java.lang.Override
public org.eclipse.californium.core.network.Exchange receiveEmptyMessage(final org.eclipse.californium.core.coap.EmptyMessage message) {
    org.eclipse.californium.core.network.Exchange.KeyMID idByMID = org.eclipse.californium.core.network.Exchange.KeyMID.fromInboundMessage(message);
    org.eclipse.californium.core.network.Exchange exchange = exchangeStore.remove(idByMID);
    if (exchange != null) {
        org.eclipse.californium.core.network.UdpMatcher.LOGGER.log(java.util.logging.Level.FINE, "Received expected reply for message exchange {0}", idByMID);
    }else {
        org.eclipse.californium.core.network.UdpMatcher.LOGGER.log(java.util.logging.Level.FINE, "Ignoring unmatchable empty message from {0}:{1}: {2}", new java.lang.Object[]{ message.getSource() , message.getSourcePort() , message });
    }
    return exchange;
}