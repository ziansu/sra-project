@java.lang.Override
protected void onDestroy() {
    org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.EDITOR_CLOSED);
    mDispatcher.unregister(this);
    doUnbindUploadService();
    super.onDestroy();
}