private void subscribeToPushService() {
    com.google.firebase.messaging.FirebaseMessaging.getInstance().subscribeToTopic("Test");
}