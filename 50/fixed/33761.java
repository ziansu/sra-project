private void stopNotificationThread() {
    if ((this.notifierTimer) != null) {
        android.util.Log.d(IotConstants.LOG_TAG, "stopping notification timer");
        this.notifierTimer.cancel();
    }
}