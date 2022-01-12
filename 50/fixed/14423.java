@java.lang.Override
public void onPause() {
    super.onPause();
    android.support.v4.content.LocalBroadcastManager.getInstance(this.context).unregisterReceiver(messageReceiver);
    this.myGridView.setAdapter(null);
}