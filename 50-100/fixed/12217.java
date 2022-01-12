@java.lang.Override
protected void onPause() {
    super.onPause();
    unregisterReceiver();
    if (isAnimatingRefreshButton) {
        isAnimatingRefreshButton = false;
    }
    if (mShouldFinish) {
        overridePendingTransition(0, 0);
        finish();
    }
    if ((mScrollPositionManager) != null) {
        mScrollPositionManager.saveToPreferences(this, org.wordpress.android.ui.WPDrawerActivity.SCROLL_POSITION_ID);
    }
}