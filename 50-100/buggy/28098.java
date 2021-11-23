@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.crashlytics.android.Crashlytics crashlyticsKit = new com.crashlytics.android.Crashlytics.Builder().core(new com.crashlytics.android.core.CrashlyticsCore.Builder().disabled(BuildConfig.DEBUG).build()).build();
    io.fabric.sdk.android.Fabric.with(this, crashlyticsKit);
    mPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    mPrefs.registerOnSharedPreferenceChangeListener(this);
    org.greenrobot.eventbus.EventBus.builder().logNoSubscriberMessages(false).sendNoSubscriberEvent(false).installDefaultEventBus();
    com.jbirdvegas.mgerrit.objects.CacheManager.init(this);
    requestServerVersion(false);
}