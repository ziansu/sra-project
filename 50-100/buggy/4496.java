@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.i(com.playposse.peertopeeroxygen.android.firebase.OxygenFirebaseMessagingService.LOG_CAT, "OxygenFirebaseMessagingService.onCreate is called");
    android.content.Intent intent = new android.content.Intent(this, com.playposse.peertopeeroxygen.android.data.DataService.class);
    dataServiceConnection = new com.playposse.peertopeeroxygen.android.data.DataServiceConnection(new com.playposse.peertopeeroxygen.android.firebase.OxygenFirebaseMessagingService.EmptyDataReceivedCallback(), false);
    bindService(intent, dataServiceConnection, Context.BIND_AUTO_CREATE);
    com.google.firebase.messaging.FirebaseMessaging.getInstance().subscribeToTopic(com.playposse.peertopeeroxygen.android.firebase.OxygenFirebaseMessagingService.ALL_DEVICES_TOPIC);
}