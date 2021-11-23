@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    android.util.Log.w(org.forestguardian.DataAccess.Location.LocationController.TAG, "onProviderDisabled");
    for (org.forestguardian.DataAccess.Location.LocationController.SimpleLocationListener listener : mListeners) {
        listener.onUnavailable();
    }
}