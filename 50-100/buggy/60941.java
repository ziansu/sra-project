@java.lang.Override
public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    super.onMessageReceived(remoteMessage);
    com.github.randoapp.api.API.syncUserAsync(null);
    com.github.randoapp.log.Log.i(com.github.randoapp.service.RandoMessagingService.class, ("Firebase RandoMessage: " + (remoteMessage.toString())));
    com.github.randoapp.log.Log.d(com.github.randoapp.service.RandoMessagingService.class, ("Firebase From: " + (remoteMessage.getFrom())));
    com.github.randoapp.log.Log.d(com.github.randoapp.service.RandoMessagingService.class, ("Firebase Notification Message Body: " + (remoteMessage.getData().toString())));
}