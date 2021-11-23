private void stopLocationUpdate() {
    curLocationManager.removeUpdates(this);
    searchingForLocation = false;
    stopTimer();
}