@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (me.bromen.podgo.BuildConfig.DEBUG) {
        timber.log.Timber.plant(new timber.log.Timber.DebugTree());
    }
    component = me.bromen.podgo.app.dagger.DaggerAppComponent.builder().appModule(new me.bromen.podgo.app.dagger.module.AppModule(this)).build();
    component.episodeDownloads().registerReceiver();
    android.util.Log.d("APP", "register");
    component.episodeDownloads().validateDownloads();
}