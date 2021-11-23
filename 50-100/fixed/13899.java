@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (com.squareup.leakcanary.LeakCanary.isInAnalyzerProcess(this)) {
        return ;
    }
    mRefWatcher = com.squareup.leakcanary.LeakCanary.install(this);
    com.supercilex.robotscouter.util.Constants.init(this);
    com.supercilex.robotscouter.util.DatabaseHelper.init(this);
    com.supercilex.robotscouter.util.AnalyticsUtils.init(this);
    com.google.firebase.remoteconfig.FirebaseRemoteConfig config = com.google.firebase.remoteconfig.FirebaseRemoteConfig.getInstance();
    config.setDefaults(R.xml.remote_config_defaults);
    config.setConfigSettings(new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder().setDeveloperModeEnabled(BuildConfig.DEBUG).build());
}