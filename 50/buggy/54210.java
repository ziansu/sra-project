@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
    com.jmgarzo.dublinbus.sync.SyncTasks.syncRoute(this);
}