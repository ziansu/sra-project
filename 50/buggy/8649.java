private void performHideLaunchScreen() {
    mLaunchScreenDialog.dismiss();
    mLaunchScreenDialog = null;
    if ((mReadyWhen) == (org.xwalk.core.internal.XWalkLaunchScreenManager.ReadyWhenType.CUSTOM)) {
        mActivity.unregisterReceiver(mLaunchScreenReadyWhenReceiver);
    }
}