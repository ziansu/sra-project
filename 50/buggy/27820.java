@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    int result = super.onStartCommand(intent, flags, startId);
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onStartCommand");
    return result;
}