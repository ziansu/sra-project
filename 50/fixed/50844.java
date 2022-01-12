@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    hideProgressDialog();
    stopScan();
    if (isFinishing()) {
        no.nordicsemi.android.thingylib.ThingySdkManager.clearInstance();
    }
}