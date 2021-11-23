@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.rndapp.mtamap.SubwayApplication.mInstance = this;
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    com.rndapp.mtamap.Analytics.init(this);
}