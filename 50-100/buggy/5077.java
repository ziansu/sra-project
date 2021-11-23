@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(com.android.bluetooth.gatt.ScanManager.TAG, ("awakened up at time " + (android.os.SystemClock.elapsedRealtime())));
    java.lang.String action = intent.getAction();
    if (action.equals(com.android.bluetooth.gatt.ScanManager.ACTION_REFRESH_BATCHED_SCAN)) {
        if (mBatchClients.isEmpty()) {
            return ;
        }
        flushBatchScanResults(mBatchClients.iterator().next());
    }
}