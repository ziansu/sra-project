@java.lang.Override
protected void onPause() {
    super.onPause();
    try {
        connectIQ.unregisterAllForEvents();
        connectIQ.shutdown(this);
    } catch (java.lang.Exception e) {
        if (Constants.LOG_ACTIVE) {
            android.util.Log.wtf(getString(R.string.app_log_tag), ((de.achimonline.hueciq.IQDeviceList.LOG_PREFIX) + "Exception while trying to shutdown the CIQ-SDK."));
        }
    }
}