@java.lang.Override
public void removeTabView() {
    android.util.Log.d(acr.browser.lightning.activity.BrowserActivity.TAG, "Remove the tab view");
    mBrowserFrame.setBackgroundColor(mBackgroundColor);
    mBrowserFrame.removeAllViews();
    acr.browser.lightning.activity.BrowserActivity.removeViewFromParent(mCurrentView);
    mCurrentView = null;
    mDrawerHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mDrawerLayout.closeDrawers();
        }
    }, 200);
}