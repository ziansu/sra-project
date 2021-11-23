@java.lang.Override
public void onDestroy() {
    android.util.Log.i(TAG, "MainActivity.onDestroy()");
    unregisterReceiver(receiver);
    super.onDestroy();
}