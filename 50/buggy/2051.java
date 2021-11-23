@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d(PACKAGE_NAME, "AlwaysOnTop : onStartCommand");
    OnTop_view.setSystemUiVisibility(ui_Options);
    timer_start();
    return super.onStartCommand(intent, flags, startId);
}