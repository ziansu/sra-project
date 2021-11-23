public void onEvent(final com.exacttarget.etpushsdk.event.ReadyAimFireInitCompletedEvent event) {
    android.util.Log.d(com.leadclic.MCPluginApplication.TAG, "onReadyAimFireInitCompletedEvent start");
    com.exacttarget.etpushsdk.ETPush etPush = null;
    try {
        etPush = event.getEtPush();
        etPush.addTag("2.1.0");
        etPush.pushManager.setNotificationResourceId(R.drawable.ic_stat_sdk_explorer);
    } catch (com.exacttarget.etpushsdk.ETException e) {
        android.util.Log.d(com.leadclic.MCPluginApplication.TAG, ("ERROR onReadyAimFireInitCompletedEvent: " + (e.getMessage())));
    }
    android.util.Log.d(com.leadclic.MCPluginApplication.TAG, "onReadyAimFireInitCompletedEvent end");
}