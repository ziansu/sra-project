public void playQueue(org.eclipse.smarthome.core.types.Command command) {
    try {
        org.eclipse.smarthome.binding.sonos.handler.ZonePlayerHandler coordinator = getCoordinatorHandler();
        coordinator.setCurrentURI((("x-rincon-queue:" + (getUDN())) + "#0"), "");
        coordinator.setMute(OnOffType.OFF);
        coordinator.play();
    } catch (java.lang.IllegalStateException e) {
        logger.warn("Cannot play queue ({})", e.getMessage());
    }
}