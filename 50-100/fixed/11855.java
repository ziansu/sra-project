public void setServiceDown() {
    com.antest1.kcanotify.KcaService.isPortAccessed = false;
    if ((missionTimeScheduler) != null) {
        missionTimeScheduler.shutdown();
    }
    handler = null;
    nHandler = null;
    mediaPlayer.release();
    mediaPlayer = null;
    stopForeground(true);
    notifiManager.cancelAll();
    currentPortDeckData = null;
    viewNotificationBuilder = null;
    com.antest1.kcanotify.KcaService.isServiceOn = false;
}