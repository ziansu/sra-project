private void doStop() {
    mCurrentDeviceName = "";
    mCurrentTime = 0;
    if ((mTV) != null) {
        mTV.disconnect();
        mTV = null;
    }
    mMediaPlayer = null;
    mMediaControl = null;
    mVolumeControl = null;
    if ((mStatusChangeListener) != null) {
        mStatusChangeListener.onApplicationDisconnected();
        mStatusChangeListener.onDeviceUnselected();
    }
}