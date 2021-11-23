private void resetOriginalScreen() {
    if ((mContactSyncResponseReceiver) != null) {
        unregisterReceiver(mContactSyncResponseReceiver);
    }
    mContactManager = new company.greatapp.moneycircle.manager.ContactManager(this);
}