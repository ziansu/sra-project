@java.lang.Override
public void onDestroy() {
    org.md2k.utilities.Report.Log.d(org.md2k.datakit.ServiceDataKit.TAG, "onDestroy()...");
    dataSourceManager = null;
    dataManager = null;
    if ((databaseLogger) != null) {
        databaseLogger.close();
        databaseLogger = null;
    }
    super.onDestroy();
    org.md2k.utilities.Report.Log.d(org.md2k.datakit.ServiceDataKit.TAG, "...onDestroy()");
}