@java.lang.Override
public void onCreate() {
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    super.onCreate();
    if (BuildConfig.DEBUG) {
        com.squareup.picasso.Picasso.setSingletonInstance(new com.squareup.picasso.Picasso.Builder(this).indicatorsEnabled(true).build());
    }else {
        defaultHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }
    com.marverenic.music.PlayerController.startService(getApplicationContext());
}