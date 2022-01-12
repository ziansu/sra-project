@java.lang.Override
public void run() {
    if (isActivityDestroyed())
        return ;
    
    if ((mToolbarManager) != null) {
        org.chromium.base.metrics.RecordHistogram.recordTimesHistogram(("MobileStartup.ToolbarInflationTime." + simpleName), mInflateInitialLayoutDurationMs, java.util.concurrent.TimeUnit.MILLISECONDS);
        mToolbarManager.onDeferredStartup(getOnCreateTimestampMs(), simpleName);
    }
    if (org.chromium.chrome.browser.multiwindow.MultiWindowUtils.getInstance().isInMultiWindowMode(this)) {
        onDeferredStartupForMultiWindowMode();
    }
}