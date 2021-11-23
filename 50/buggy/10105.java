@java.lang.Override
protected void onDestroy() {
    announcementHandler.shutDown();
    vibrationHandler.stopVibrate();
    announcementHandler = null;
    vibrationHandler = null;
    gameHandler = null;
    prefs = null;
    super.onDestroy();
}