@java.lang.Override
protected void onStop() {
    android.util.Log.d("Jane", "unregister Receiver");
    unregisterReceiver(broadcastReceiver);
    super.onStop();
}