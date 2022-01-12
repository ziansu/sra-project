public org.netlight.client.Connector build() {
    return new org.netlight.client.Connector(remoteAddress, reconnectInterval, org.netlight.util.CommonUtils.getOrDefault(serializer, org.netlight.client.Connector.DEFAULT_OBJECT_SERIALIZER));
}