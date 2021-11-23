@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.v("2", "onStop");
    if (!(mRegisterReceiver)) {
        android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mReceiver);
    }
}