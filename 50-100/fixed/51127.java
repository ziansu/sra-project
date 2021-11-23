@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.md2k.utilities.Report.Log.d(org.md2k.datakit.ServiceDataKit.TAG, "onCreate()...");
    databaseLogger = org.md2k.datakit.logger.DatabaseLogger.getInstance(this);
    dataSourceManager = new org.md2k.datakit.manager.DataSourceManager();
    dataManager = new org.md2k.datakit.manager.DataManager();
    mMessenger = new android.os.Messenger(new org.md2k.datakit.ServiceDataKit.IncomingHandler());
    org.md2k.utilities.Report.Log.d(org.md2k.datakit.ServiceDataKit.TAG, ("databaseLogger=" + (databaseLogger)));
    org.md2k.utilities.Report.Log.d(org.md2k.datakit.ServiceDataKit.TAG, "...onCreate()");
}