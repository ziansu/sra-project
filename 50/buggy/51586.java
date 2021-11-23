@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    onLocationChanged();
    android.util.Log.d("Receiver", "I received the message");
}