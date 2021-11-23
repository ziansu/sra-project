@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    startLocationUpdates(true);
    android.util.Log.d(Constants.TAG, "Starting location updates...");
}