private void resetOriginalScreen() {
    if ((mContactSyncResponseReceiver) != null) {
        unregisterReceiver(mContactSyncResponseReceiver);
        mContactSyncResponseReceiver = null;
    }
    mContactManager = new company.greatapp.moneycircle.manager.ContactManager(this);
}