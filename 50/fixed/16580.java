public void addAvailableRemoteDevices(final java.lang.String channelName, final org.csstudio.cagateway.MetaData metaData) {
    availableRemoteDevices.put(channelName, metaData);
    org.csstudio.cagateway.CaServer.LOG.info("Add to available remote devices: {}", channelName);
    org.csstudio.cagateway.CaServer.getNumberOfServedChannelsCollector().incrementValue();
    return ;
}