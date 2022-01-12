@java.lang.Override
public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> results) {
    android.util.Log.i(com.example.nutri_000.testinggauge.MainActivity.TAG, (("onBatchScanResults: " + (results.size())) + " results"));
    for (android.bluetooth.le.ScanResult result : results) {
        processResult(result);
    }
}