@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mHandler.removeCallbacks(mPollingRunnable);
    if (admobilize.matrix.gt.MainActivity.DEBUG)
        android.util.Log.i(admobilize.matrix.gt.MainActivity.TAG, "Closing devices and GPIO");
    
    try {
        everloop.clear();
        everloop.write();
        spiDevice.close();
    } catch (java.io.IOException e) {
        android.util.Log.e(admobilize.matrix.gt.MainActivity.TAG, "Error on PeripheralIO API", e);
    }
}