@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    scheduleUploading();
    return super.onStartCommand(intent, flags, startId);
}