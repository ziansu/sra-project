@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.os.Bundle extras = intent.getExtras();
    com.google.android.gms.gcm.GoogleCloudMessaging gcm = com.google.android.gms.gcm.GoogleCloudMessaging.getInstance(this);
    java.lang.String messageType = gcm.getMessageType(intent);
    if (!(extras.isEmpty())) {
        switch (messageType) {
            case com.google.android.gms.gcm.GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE :
                {
                    com.thomasdh.roosterpgplus.Notifications.GCMIntentService.createNotification(extras.getString("title"), extras.getString("message"), this);
                }
        }
    }
    com.thomasdh.roosterpgplus.Notifications.GCMBroadcastReceiver.completeWakefulIntent(intent);
}