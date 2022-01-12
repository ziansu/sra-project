public void performExit() {
    if ((locationThread) != null) {
        locationThread.interrupt();
        locationThread = null;
    }
    context = null;
    locationManager = null;
    locationSubscriber = null;
    speedSubscriber = null;
    maxSpeedSubscriber = null;
}