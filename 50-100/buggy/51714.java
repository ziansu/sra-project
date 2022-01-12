@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.facebook.soloader.SoLoader.init(this, false);
    com.jakewharton.threetenabp.AndroidThreeTen.init(this);
    timber.log.Timber.plant(new timber.log.Timber.DebugTree());
    com.facebook.stetho.Stetho.initialize(com.facebook.stetho.Stetho.newInitializerBuilder(this).enableWebKitInspector(new com.facebook.litho.LithoWebKitInspector(this)).build());
    com.facebook.litho.config.ComponentsConfiguration.debugHighlightMountBounds = true;
    com.facebook.litho.config.ComponentsConfiguration.debugHighlightInteractiveBounds = true;
}