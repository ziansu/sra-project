private void logInfo(java.lang.String message) {
    android.util.Log.i(jp.straylight.scannerapp.ScanResultsReporter.TAG, message);
    listener.onReport(message);
}