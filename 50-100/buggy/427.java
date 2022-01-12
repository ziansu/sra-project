@java.lang.Override
public void onCreate() {
    setTheme(com.marverenic.music.utils.Themes.getTheme(this));
    super.onCreate();
    if (BuildConfig.DEBUG) {
        com.squareup.picasso.Picasso.setSingletonInstance(new com.squareup.picasso.Picasso.Builder(this).indicatorsEnabled(true).build());
    }else {
        defaultHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
        io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    }
    com.marverenic.music.PlayerController.startService(getApplicationContext());
}