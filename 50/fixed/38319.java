public void removeAvailableRemoteDevices(final java.lang.String channelName) {
    availableRemoteDevices.remove(channelName);
    org.csstudio.cagateway.CaServer.LOG.info("Remove from available remote devices: {}", channelName);
    org.csstudio.cagateway.CaServer.getNumberOfServedChannelsCollector().decrementValue();
    return ;
}