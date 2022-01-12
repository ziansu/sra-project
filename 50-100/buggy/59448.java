protected void publishPlanet() {
    org.openhab.binding.astro.handler.AstroThingHandler.logger.debug("Publishing planet {} for thing {}", getPlanet().getClass().getSimpleName(), getThing().getUID());
    for (org.eclipse.smarthome.core.thing.Channel channel : getThing().getChannels()) {
        publishChannelIfLinked(channel);
    }
}