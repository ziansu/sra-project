public org.netlight.client.Connector build() {
    return new org.netlight.client.Connector(remoteAddress, org.netlight.util.CommonUtils.getOrDefault(reconnectInterval, org.netlight.client.Connector.DEFAULT_RECONNECT_INTERVAL), org.netlight.util.CommonUtils.getOrDefault(serializer, org.netlight.client.Connector.DEFAULT_OBJECT_SERIALIZER));
}