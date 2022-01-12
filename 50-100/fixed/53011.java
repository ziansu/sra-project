@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.android.angrybird.AngryBirdApp.appInstance = this;
    io.fabric.sdk.android.Fabric.with(getApplicationContext(), new com.crashlytics.android.Crashlytics());
    com.android.angrybird.prefs.PreferenceUtil.getInstance().initPrefs(getApplicationContext());
    com.android.angrybird.util.ApplicationLifeCycleHandler handler = new com.android.angrybird.util.ApplicationLifeCycleHandler();
    registerActivityLifecycleCallbacks(handler);
    registerComponentCallbacks(handler);
}