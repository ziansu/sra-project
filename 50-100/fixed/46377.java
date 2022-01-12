@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (!(BuildConfig.DEBUG)) {
        org.bottiger.podcast.flavors.CrashReporter.CrashReporterFactory.startReporter(this);
    }
    org.bottiger.podcast.SoundWaves.sAnalytics = org.bottiger.podcast.flavors.Analytics.AnalyticsFactory.getAnalytics(this);
    org.bottiger.podcast.SoundWaves.sAnalytics.startTracking();
    org.bottiger.podcast.SoundWaves.context = getApplicationContext();
    org.bottiger.podcast.SoundWaves.sSubscriptionRefreshManager = new org.bottiger.podcast.service.Downloader.SubscriptionRefreshManager(org.bottiger.podcast.SoundWaves.context);
    firstRun(org.bottiger.podcast.SoundWaves.context);
}