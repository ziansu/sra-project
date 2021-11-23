@java.lang.Override
public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    java.lang.String projectID = java.lang.String.valueOf(remoteMessage.getData().get("project_id"));
    if ((remoteMessage.getNotification()) != null) {
        sendNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody(), projectID);
    }
}