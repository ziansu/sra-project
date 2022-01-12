private void notificationNetServiceDeviceRemoved(com.parrot.arsdk.ardiscovery.ARDiscoveryDeviceService deviceService) {
    com.parrot.arsdk.arsal.ARSALPrint.d(com.parrot.arsdk.ardiscovery.ARDiscoveryJmdnsDiscovery.TAG, "notificationServiceDeviceRemoved");
    com.parrot.arsdk.ardiscovery.ARDiscoveryDeviceService deviceServiceRemoved = netDeviceServicesHmap.remove(deviceService.getName());
    if ((deviceServiceRemoved != null) && ((broadcaster) != null)) {
        broadcaster.broadcastDeviceServiceArrayUpdated();
    }else {
        com.parrot.arsdk.arsal.ARSALPrint.w(com.parrot.arsdk.ardiscovery.ARDiscoveryJmdnsDiscovery.TAG, (("service: " + (deviceService.getName())) + " not known"));
    }
}