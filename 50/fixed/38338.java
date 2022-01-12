@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    io.github.data4all.logger.Log.d(io.github.data4all.service.GPSservice.TAG, "onStartCommand");
    return START_STICKY;
}