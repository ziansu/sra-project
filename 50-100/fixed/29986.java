private void updateNetworkTrafficState(int mIndex) {
    if (mIndex <= 0) {
        mNetTrafficUnit.setEnabled(false);
        mNetTrafficPeriod.setEnabled(false);
        mNetTrafficAutohide.setEnabled(false);
    }else {
        mNetTrafficUnit.setEnabled(true);
        mNetTrafficPeriod.setEnabled(true);
        mNetTrafficAutohide.setEnabled(true);
    }
}