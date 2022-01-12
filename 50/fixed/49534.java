protected void stopDConnect() {
    sendTerminateEvent();
    mPluginMgr.setEventListener(null);
    if ((mRequestManager) != null) {
        mRequestManager.shutdown();
    }
    hideNotification();
}