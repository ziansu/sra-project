@java.lang.Override
public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    android.util.Log.d(com.ln.firebase.MyFirebaseMessagingService.TAG, ("From: " + (remoteMessage.getData())));
    android.util.Log.d(com.ln.firebase.MyFirebaseMessagingService.TAG, "get notification");
    android.util.Log.d(com.ln.firebase.MyFirebaseMessagingService.TAG, ("Notification NewsOfCustomer Body: " + (remoteMessage.toString())));
    java.lang.String title = remoteMessage.getData().get("title");
    java.lang.String message = remoteMessage.getData().get("message");
    sendNotification(message, title);
}