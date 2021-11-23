@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.widget.Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
    return START_STICKY;
}