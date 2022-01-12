@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    java.lang.String toastMessage = "";
    switch (status) {
        case android.location.LocationProvider.OUT_OF_SERVICE :
            android.util.Log.w(org.forestguardian.DataAccess.Location.LocationController.TAG, "OUT_OF_SERVICE");
            for (org.forestguardian.DataAccess.Location.LocationController.SimpleLocationListener listener : mListeners) {
                listener.onUnavailable();
            }
            break;
        case android.location.LocationProvider.TEMPORARILY_UNAVAILABLE :
            android.util.Log.w(org.forestguardian.DataAccess.Location.LocationController.TAG, "TEMPORARILY_UNAVAILABLE");
            break;
        case android.location.LocationProvider.AVAILABLE :
            android.util.Log.w(org.forestguardian.DataAccess.Location.LocationController.TAG, "AVAILABLE");
            break;
    }
    android.util.Log.d("Location", toastMessage);
}