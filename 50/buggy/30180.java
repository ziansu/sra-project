@java.lang.Override
public void onCreate() {
    super.onCreate();
    peter.util.searcher.net.CommonRetrofit.getInstance().init(this);
    com.facebook.stetho.Stetho.initializeWithDefaults(this);
}