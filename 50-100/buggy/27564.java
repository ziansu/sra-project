@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (com.swarmnyc.watchfaces.WeatherWatchFaceConfigActivity.class.getSimpleName().equals(intent.getAction())) {
        mPeerId = intent.getStringExtra("PeerId");
        startTask();
    }
    return super.onStartCommand(intent, flags, startId);
}