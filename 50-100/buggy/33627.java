public synchronized com.google.android.gms.analytics.Tracker getDefaultTracker() {
    if ((mTracker) == null) {
        com.google.android.gms.analytics.GoogleAnalytics analytics = com.google.android.gms.analytics.GoogleAnalytics.getInstance(this);
        mTracker = analytics.newTracker("UA-56060946-4");
        mTracker.enableExceptionReporting(true);
        mTracker.enableAdvertisingIdCollection(true);
        mTracker.enableAutoActivityTracking(true);
    }
    return mTracker;
}