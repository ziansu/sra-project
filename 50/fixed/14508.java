private void initializeMaxDevices() {
    for (org.eclipse.smarthome.core.thing.Thing thing : getThing().getThings()) {
        org.eclipse.smarthome.core.thing.binding.ThingHandler handler = thing.getHandler();
        if (handler != null) {
            handler.initialize();
        }
    }
}