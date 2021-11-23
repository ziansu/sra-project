public void stopTracking() {
    if (getGoogleApiClient().isConnected())
        stopLocationUpdates(getGoogleApiClient());
    
    com.chernandezgil.farmacias.Utilities.Utils.logD(com.chernandezgil.farmacias.ui.fragment.GPSTrackerFragment.LOG_TAG, "stopLocationUpdates");
}