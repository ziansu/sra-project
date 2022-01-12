private void performScheduleReceiver(com.lody.virtual.client.IVClient client, int vuid, android.content.pm.ActivityInfo info, android.content.Intent intent, com.lody.virtual.helper.proto.PendingResultData result) {
    android.content.ComponentName componentName = com.lody.virtual.helper.utils.ComponentUtils.toComponentName(info);
    com.lody.virtual.server.am.BroadcastSystem.get().broadcastSent(vuid, info, result);
    try {
        client.scheduleReceiver(componentName, intent, result);
    } catch (java.lang.Throwable e) {
        if (result != null) {
            result.build().finish();
        }
    }
}