private void sendPlayBroadcastMessage() {
    updateNotificationAction(false);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(getStandardPlayerBroadcast(com.example.tonykazanjian.mp4player.PlayerService.PLAYER_START_MSG));
}