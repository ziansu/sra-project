private void logError(java.lang.String message) {
    android.util.Log.e(jp.straylight.scannerapp.ScanResultsReporter.TAG, message);
    listener.onReport(("ERROR: " + message));
}