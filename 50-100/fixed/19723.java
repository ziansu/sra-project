@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.widget.Toast.makeText(context, ((("receive a broadcast " + (context.toString())) + " ") + (intent.toString())), Toast.LENGTH_LONG).show();
}