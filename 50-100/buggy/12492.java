public void continuouslyDiscoverServices() {
    android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Continuously Discover services called");
    if ((serviceDiscoveryRegistered) == false) {
        android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Setting up service discovery");
        registerServiceDiscoveryListeners();
        serviceDiscoveryRegistered = true;
    }
    if (continuouslyDiscovering) {
        android.util.Log.w(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Services are still discovering, do not need to make this call");
    }else {
        addServiceDiscoveryRequest();
        android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Submitting first discover task");
        continuouslyDiscovering = true;
        serviceDiscoveryTasks = new java.util.ArrayList<>();
        discoverServices();
        submitServiceDiscoveryTask();
    }
}