private long calculateMaxTransactionDuration(org.eclipse.californium.core.network.Exchange exchange) {
    return ((long) (((config.getInt(NetworkConfigDefaults.ACK_TIMEOUT_SCALE)) * (getRemoteEndpoint(exchange).getRTO())) * (java.lang.Math.pow(getRemoteEndpoint(exchange).getExchangeVBF(exchange), 5))));
}