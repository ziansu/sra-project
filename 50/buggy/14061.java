@java.lang.Override
public void onConnectionSuspended(int i) {
    android.util.Log.d(com.airbitz.objects.PlayLocationManager.TAG, "Suspended. Please re-connect.");
    if ((mObservers.size()) != 0) {
        attemptConnection();
    }
}