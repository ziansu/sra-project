@java.lang.Override
public void handleMessage(android.os.Message msg) {
    android.os.IBinder token = ((android.os.IBinder) (msg.obj));
    com.lody.virtual.server.am.BroadcastSystem.BroadcastRecord r = mBroadcastRecords.remove(token);
    if (r != null) {
        com.lody.virtual.helper.utils.VLog.w(com.lody.virtual.server.am.BroadcastSystem.TAG, "Broadcast timeout, cancel to dispatch it.");
        r.pendingResult.build().finish();
    }
}