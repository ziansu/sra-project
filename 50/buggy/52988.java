public void onResume(java.lang.Boolean wasPlaying, boolean updateState) {
    mBluetooth.addObserver(this);
    update(wasPlaying, updateState);
}