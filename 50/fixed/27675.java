@java.lang.Override
public void run() {
    android.util.Log.d(org.physical_web.physicalweb.NearbyBeaconsFragment.TAG, "running second scan timeout");
    emptyGroupIdQueue();
    mSecondScanComplete = true;
}