private void stopMusic() {
    android.util.Log.e("Stop Music", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    mediaPlayer.stop();
    stopSelf();
    ((android.app.NotificationManager) (getApplicationContext().getSystemService(com.example.kyler.musicplayer.Model.NOTIFICATION_SERVICE))).cancelAll();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            timerComplete = false;
        }
    }, 800);
}