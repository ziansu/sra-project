@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.e(in.apps.maitreya.travelalarm.BackgroundLocationService.TAG, "onStartCommand");
    setIntervals(intent.getFloatExtra("act_dist", (-1)), intent.getFloatExtra("alarm_dist", (-1)));
    super.onStartCommand(intent, flags, startId);
    return START_STICKY;
}