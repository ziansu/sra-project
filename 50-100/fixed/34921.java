private void gcmStatusUpdate() {
    org.matrix.androidsdk.util.Log.d(im.vector.services.EventStreamService.LOG_TAG, "## gcmStatusUpdate");
    if (mIsForeground) {
        org.matrix.androidsdk.util.Log.d(im.vector.services.EventStreamService.LOG_TAG, "## gcmStatusUpdate : gcm status succeeds so stopForeground");
        if ((im.vector.services.EventStreamService.FOREGROUND_LISTENING_FOR_EVENTS) == (mForegroundServiceIdentifier)) {
            stopForeground(true);
            mForegroundServiceIdentifier = -1;
            mIsForeground = false;
        }
    }
    updateServiceForegroundState();
}