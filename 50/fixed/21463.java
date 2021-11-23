@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.v(bicyclewatchdog.com.bicyclewatchdog.gps_management.GpsManager.TAG, "Successful connection to google api");
    if (shouldResume) {
        android.util.Log.v(bicyclewatchdog.com.bicyclewatchdog.gps_management.GpsManager.TAG, "Calling resumeGPS...");
        resumeGPS();
        shouldResume = false;
    }
}