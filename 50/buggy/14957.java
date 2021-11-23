@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.facebook.soloader.SoLoader.init(this, false);
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
}