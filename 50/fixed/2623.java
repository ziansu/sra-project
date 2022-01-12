@java.lang.Override
public void onCreate() {
    super.onCreate();
    if ((helper) == null) {
        helper = new eu.veldsoft.share.with.us.storage.MessageHistoryDatabaseHelper(this);
    }
}