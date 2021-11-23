@java.lang.Override
public void onMessageReceived(com.google.android.gms.wearable.MessageEvent messageEvent) {
    super.onMessageReceived(messageEvent);
    if ("/KEEPMESAFE".equals(messageEvent.getPath())) {
        android.util.Log.d("myTag", "Message received from Wearable");
        android.content.Intent intent = new android.content.Intent("my-event");
        android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}