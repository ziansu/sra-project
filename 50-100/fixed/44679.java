private void publishEvent(final org.hudsonci.rest.model.build.BuildEventDTO event) {
    assert event != null;
    try {
        org.cometd.bayeux.server.ServerChannel channel = org.hudsonci.rest.plugin.cometd.CometdProvider.getChannel(org.hudsonci.rest.plugin.cometd.BuildEventPublisher.CHANNEL);
        if (channel != null) {
            java.lang.String data = codec.encode(event);
            org.hudsonci.rest.plugin.cometd.BuildEventPublisher.log.debug("Publishing event w/data: {}", data);
            channel.publish(null, data);
        }else {
            org.hudsonci.rest.plugin.cometd.BuildEventPublisher.log.trace("Channel does not exist; skipping publish event");
        }
    } catch (java.lang.Exception e) {
        org.hudsonci.rest.plugin.cometd.BuildEventPublisher.log.error("Failed to publish event", e);
    }
}