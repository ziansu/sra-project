@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    boolean result = super.onUnbind(intent);
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onUnbind");
    return result;
}