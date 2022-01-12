@java.lang.Override
public void onCreate() {
    super.onCreate();
    configureLog();
    appComponent = co.smartreceipts.android.di.DaggerAppComponent.builder().baseAppModule(new co.smartreceipts.android.di.BaseAppModule(this)).build();
    appComponent.inject(this);
    co.smartreceipts.android.utils.WBUncaughtExceptionHandler.initialize();
    co.smartreceipts.android.utils.log.Logger.debug(this, "\n\n\n\n Launching App...");
    init();
}