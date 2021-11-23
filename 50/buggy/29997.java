@java.lang.Override
public void onTerminate() {
    super.onTerminate();
    component.episodeDownloads().unregisterReceiver();
    android.util.Log.d("APP", "unregister");
}