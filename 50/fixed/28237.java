@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.e("SPEAK RECEIVER", "received message ******");
    speaker.speak(intent.getStringExtra("message_to_speak"));
}