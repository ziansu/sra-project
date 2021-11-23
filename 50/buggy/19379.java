@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    android.util.Log.w(org.forestguardian.DataAccess.Location.LocationController.TAG, "onProviderDisabled");
    mListeners.forEach(org.forestguardian.DataAccess.Location.LocationController.SimpleLocationListener::onUnavailable);
}