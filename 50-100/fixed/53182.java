private void setControllerUsers() {
    if ((mZenModeController) != null) {
        mZenModeController.setUserId(mCurrentUserId);
    }
    if ((mBatteryController) != null) {
        mBatteryController.setUserId(mCurrentUserId);
    }
    if ((mDockBatteryController) != null) {
        mDockBatteryController.setUserId(mCurrentUserId);
    }
}