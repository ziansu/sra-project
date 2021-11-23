public void onConnectionLost() {
    logger.debug("Bridge connection lost. Updating thing status to OFFLINE.");
    previousOnline = false;
    updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.OFFLINE.COMMUNICATION_ERROR);
    for (org.eclipse.smarthome.core.thing.Thing thing : org.openhab.binding.max.internal.handler.MaxCubeBridgeHandler.getThing().getThings()) {
        org.eclipse.smarthome.core.thing.binding.ThingHandler handler = thing.getHandler();
        if ((handler != null) && (handler instanceof org.openhab.binding.max.internal.handler.MaxDevicesHandler)) {
            ((org.openhab.binding.max.internal.handler.MaxDevicesHandler) (handler)).setForceRefresh();
        }
    }
    clearDeviceList();
}