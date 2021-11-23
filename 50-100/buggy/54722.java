private void unregisterDeviceDiscoveryService() {
    if ((discoveryServiceRegistration) != null) {
        org.openhab.binding.homematic.discovery.HomematicDeviceDiscoveryService service = ((org.openhab.binding.homematic.discovery.HomematicDeviceDiscoveryService) (bundleContext.getService(discoveryServiceRegistration.getReference())));
        service.deactivate();
        discoveryServiceRegistration.unregister();
        discoveryServiceRegistration = null;
        discoveryService = null;
    }
}