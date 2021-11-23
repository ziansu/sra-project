@java.lang.Override
public void onPause() {
    super.onPause();
    storeMapState();
    android.support.v4.content.LocalBroadcastManager.getInstance(context).unregisterReceiver(mMessageReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(context).unregisterReceiver(placesUpdateReceiver);
}