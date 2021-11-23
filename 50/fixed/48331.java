private void stopScreenCapture() {
    dismissNotification();
    releaseEncoders();
    closeSocket();
    if ((mVirtualDisplay) != null) {
        mVirtualDisplay.release();
        mVirtualDisplay = null;
    }
}