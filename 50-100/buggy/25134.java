@java.lang.Override
public void onCreate() {
    super.onCreate();
    super.onCreate();
    yuku.alkitab.base.App.appctx = getApplicationContext();
    yuku.alkitab.base.App.staticInit();
    {
        final com.google.android.gms.analytics.GoogleAnalytics analytics = com.google.android.gms.analytics.GoogleAnalytics.getInstance(context);
        final com.google.android.gms.analytics.Tracker t = analytics.newTracker(context.getString(R.string.ga_trackingId));
        t.enableAutoActivityTracking(true);
        t.enableExceptionReporting(true);
        yuku.alkitab.base.App.APP_TRACKER = t;
        analytics.enableAutoActivityReports(this);
    }
}