@java.lang.Override
public void onConnectionSuspended(int i) {
    android.util.Log.d(com.tacticsgames.dontdie.activities.PlayServicesActivity.TAG, "onConnectionSuspended(): attempting to reconnect");
    googleApiClient.connect();
}