public void endCall() {
    mStatus.set(DialStatus.IDLE);
    try {
        stopComs();
        freeSlot();
        mClient = null;
    } catch (java.lang.Exception ex) {
        org.tuntuni.models.Logs.error(getClass(), "Failed to end call. Error: {0}", ex);
    }
}