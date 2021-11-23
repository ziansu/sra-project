@java.lang.Override
public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    java.lang.String projectID = java.lang.String.valueOf(remoteMessage.getData().get("project_id"));
    sendNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody(), projectID);
}