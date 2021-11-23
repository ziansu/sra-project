public void teardownSwitchBar() {
    if (mListeningToOnSwitchChange) {
        mSwitchBar.removeOnSwitchChangeListener(this);
        mListeningToOnSwitchChange = false;
    }
    mSwitchBar.hide();
    mContext.unregisterReceiver(mReceiver);
}