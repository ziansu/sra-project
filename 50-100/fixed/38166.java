private void registerDeviceDiscoveryService() {
    if ((bundleContext) != null) {
        org.openhab.binding.homematic.handler.HomematicBridgeHandler.logger.trace("Registering HomematicDeviceDiscoveryService for bridge '{}'", getThing().getUID().getId());
        discoveryService = new org.openhab.binding.homematic.discovery.HomematicDeviceDiscoveryService(this);
        discoveryServiceRegistration = bundleContext.registerService(org.eclipse.smarthome.config.discovery.DiscoveryService.class.getName(), discoveryService, new java.util.Hashtable<java.lang.String, java.lang.Object>());
        discoveryService.activate();
    }
}