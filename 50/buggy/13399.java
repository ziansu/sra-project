public void endCall() {
    try {
        stopComs();
        freeSlot();
        mClient = null;
        mStatus.set(DialStatus.IDLE);
    } catch (java.lang.Exception ex) {
        org.tuntuni.models.Logs.error(getClass(), "Failed to end call. Error: {0}", ex);
    }
}