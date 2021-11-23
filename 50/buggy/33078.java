@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("AMP", "ondestroy timetrial");
    announcementHandler.shutDown();
    vibrationHandler.stopVibrate();
    announcementHandler = null;
    vibrationHandler = null;
    gameHandler = null;
    prefs = null;
}