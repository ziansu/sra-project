public void updateEverything() {
    updateHeights();
    updateVisibilities();
    updateSystemIconsLayoutParams();
    updateClickTargets();
    updateMultiUserSwitch();
    if ((mQSPanel) != null) {
        mQSPanel.setExpanded(mExpanded);
    }
    updateClockScale();
    updateAvatarScale();
    updateClockLp();
    requestCaptureValues();
    if (mQSCSwitch) {
        updateBackgroundColor();
    }
}