private void startNavigation() {
    timber.log.Timber.d("Navigation session started.");
    if ((navigationEventListeners) != null) {
        for (com.mapbox.services.android.navigation.v5.listeners.NavigationEventListener navigationEventListener : navigationEventListeners) {
            navigationEventListener.onRunning(true);
        }
    }
    android.os.Handler responseHandler = new android.os.Handler();
    locationUpdatedThread = new com.mapbox.services.android.navigation.v5.LocationUpdatedThread(responseHandler);
    locationUpdatedThread.start();
    locationUpdatedThread.getLooper();
    timber.log.Timber.d("Background thread started");
}