@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.os.PowerManager manager = ((android.os.PowerManager) (getSystemService(Context.POWER_SERVICE)));
    lock = manager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, TAG);
    producer = new com.example.service.PointProducer(this, this, manager);
    startAsForeground();
}