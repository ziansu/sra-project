@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    update(null);
    return android.app.Service.START_STICKY;
}