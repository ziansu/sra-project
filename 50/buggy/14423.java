@java.lang.Override
public void onPause() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this.context).unregisterReceiver(messageReceiver);
    this.myGridView.setAdapter(null);
    super.onPause();
}