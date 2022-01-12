boolean logoutInternal() {
    if (com.samsung.msca.samsungvr.ui.UILib.DEBUG) {
        android.util.Log.d(com.samsung.msca.samsungvr.ui.UILib.TAG, ("logoutInternal this: " + (this)));
    }
    if (saveSessionCreds(null, null)) {
        updateCutoffTimestampLocked();
        mBus.post(mBusCallback, new com.samsung.msca.samsungvr.ui.Bus.LoggedOutEvent(this, mCutoffTimestamp));
        return true;
    }
    return false;
}