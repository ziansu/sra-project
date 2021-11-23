@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(intent, flags, startId);
    fireEvent(com.tenforwardconsulting.cordova.bgloc.BackgroundGpsPlugin.Event.MESSAGE, "StartBackGroundActivity");
    return START_REDELIVER_INTENT;
}