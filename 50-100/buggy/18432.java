@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.widget.Toast.makeText(this, "サービスを開始", Toast.LENGTH_SHORT).show();
    mTimer.schedule(mTask, 5000);
    return super.onStartCommand(intent, flags, startId);
}