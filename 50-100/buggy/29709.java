@java.lang.Override
public void onMessageReceived(java.lang.String from, android.os.Bundle data) {
    java.lang.String message = data.getString("message");
    android.util.Log.d(com.seamusdawkins.gcmcustom.gcm.GCMListenerService.TAG, ("From: " + from));
    android.util.Log.d(com.seamusdawkins.gcmcustom.gcm.GCMListenerService.TAG, ("Message: " + message));
    if (from.startsWith("/topics/")) {
    }else {
    }
    sendNotification(message);
}