@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    vibrationHandler.stopVibrate();
    announcementHandler = null;
    vibrationHandler = null;
    gameHandler = null;
    prefs = null;
}