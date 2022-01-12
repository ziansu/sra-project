@java.lang.Override
public void onCreate() {
    super.onCreate();
    handler.removeCallbacks(sendUpdatesToUI);
}