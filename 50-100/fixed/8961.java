public void continuouslyDiscoverServices() {
    if ((serviceDiscoveryRegistered) == false) {
        android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Setting up service discovery");
        registerServiceDiscoveryListeners();
        addServiceDiscoveryRequest();
        serviceDiscoveryRegistered = true;
    }
    android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Continuously Discover services called");
    if (continueDiscovering) {
        android.util.Log.w(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Services are still discovering, do not need to make this call");
    }else {
        android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Calling discover and submitting first discover task");
        continueDiscovering = true;
        discoverTasks = new java.util.ArrayList<>();
        discoverServices();
        submitDiscoverTask();
    }
}