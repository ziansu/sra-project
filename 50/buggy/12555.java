public void pauseSong() {
    mediaPlayer.pause();
    ((android.app.NotificationManager) (getApplicationContext().getSystemService(com.example.kyler.musicplayer.Model.NOTIFICATION_SERVICE))).cancel(NOTIFY_ID);
}