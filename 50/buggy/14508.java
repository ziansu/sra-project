private void initializeMaxDevices() {
    for (org.eclipse.smarthome.core.thing.Thing thing : org.openhab.binding.max.internal.handler.MaxCubeBridgeHandler.getThing().getThings()) {
        org.eclipse.smarthome.core.thing.binding.ThingHandler handler = thing.getHandler();
        if (handler != null) {
            handler.initialize();
        }
    }
}