public void halt() {
    stopForeground(true);
    dis_notifyStatus();
    mPlayer.stop();
}