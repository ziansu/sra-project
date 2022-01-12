public void playQueue() {
    try {
        org.eclipse.smarthome.binding.sonos.handler.ZonePlayerHandler coordinator = getCoordinatorHandler();
        coordinator.setCurrentURI((("x-rincon-queue:" + (coordinator.getUDN())) + "#0"), "");
        coordinator.setMute(OnOffType.OFF);
        coordinator.play();
    } catch (java.lang.IllegalStateException e) {
        logger.warn("Cannot play queue ({})", e.getMessage());
    }
}