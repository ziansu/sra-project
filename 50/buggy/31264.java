@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.widget.Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
    return super.onStartCommand(intent, flags, startId);
}