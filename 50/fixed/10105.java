@java.lang.Override
protected void onDestroy() {
    vibrationHandler.stopVibrate();
    announcementHandler = null;
    vibrationHandler = null;
    gameHandler = null;
    prefs = null;
    super.onDestroy();
}