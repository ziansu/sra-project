public void updateRemoteEndpointRTO(org.eclipse.californium.core.network.Exchange exchange) {
    long timestamp;
    long measuredRTT;
    timestamp = getRemoteEndpoint(exchange).getExchangeTimestamp(exchange);
    if (timestamp != 0) {
        measuredRTT = (java.lang.System.currentTimeMillis()) - timestamp;
        processRTTmeasurement(measuredRTT, exchange, exchange.getFailedTransmissionCount());
        getRemoteEndpoint(exchange).removeExchangeInfo(exchange);
    }
}