@java.lang.Override
public void onCreate() {
    android.util.Log.i("TimerService", "onCreate called");
    super.onCreate();
    handler.removeCallbacks(sendUpdatesToUI);
}