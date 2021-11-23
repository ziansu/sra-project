@java.lang.Override
public void onDestroy() {
    isRunning = false;
    android.util.Log.i(com.grayraven.robotexample.MyService.TAG, "Service onDestroy");
}