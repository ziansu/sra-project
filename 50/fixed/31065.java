@java.lang.Override
protected no.nordicsemi.android.nrftoolbox.profile.BleManager<no.nordicsemi.android.nrftoolbox.hrs.HRSManagerCallbacks> initializeManager() {
    return mManager = new no.nordicsemi.android.nrftoolbox.hrs.HRSManager(this);
}