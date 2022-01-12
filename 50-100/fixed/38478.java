@java.lang.Override
public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    if (!(remoteMessage.getData().isEmpty())) {
        java.util.Map<java.lang.String, java.lang.String> data = remoteMessage.getData();
        for (java.lang.String number : data.get(com.cazdevelopers.steel.firebase.SteelFirebaseMessagingService.NUMBER).split(",")) {
            android.util.Log.d(com.cazdevelopers.steel.firebase.SteelFirebaseMessagingService.TAG, ("onMessageReceived: Sending text to " + number));
            sendMessage(smsManager.divideMessage(data.get(com.cazdevelopers.steel.firebase.SteelFirebaseMessagingService.MESSAGE)), number);
        }
    }
}