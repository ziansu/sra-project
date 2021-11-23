@java.lang.Override
public void onPause() {
    storeMapState();
    super.onPause();
    android.support.v4.content.LocalBroadcastManager.getInstance(context).unregisterReceiver(mMessageReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(context).unregisterReceiver(placesUpdateReceiver);
}