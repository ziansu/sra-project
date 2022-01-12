private void notificationNetServiceDeviceRemoved(javax.jmdns.ServiceEvent serviceEvent) {
    com.parrot.arsdk.arsal.ARSALPrint.d(com.parrot.arsdk.ardiscovery.ARDiscoveryJmdnsDiscovery.TAG, "notificationServiceDeviceRemoved");
    com.parrot.arsdk.ardiscovery.ARDiscoveryDeviceService deviceServiceRemoved = netDeviceServicesHmap.remove(serviceEvent.getName());
    if (deviceServiceRemoved != null) {
        broadcaster.broadcastDeviceServiceArrayUpdated();
    }else {
        com.parrot.arsdk.arsal.ARSALPrint.w(com.parrot.arsdk.ardiscovery.ARDiscoveryJmdnsDiscovery.TAG, (("service: " + (serviceEvent.getInfo().getName())) + " not known"));
    }
}