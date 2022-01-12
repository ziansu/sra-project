@java.lang.Override
protected void onStop() {
    android.util.Log.i(net.videgro.ships.activities.OpenDeviceActivity.TAG, "onStop");
    unregisterReceiver(usbReceiver);
    super.onStop();
}