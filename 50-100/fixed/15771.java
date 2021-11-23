@java.lang.Override
public void onStop() {
    super.onStop();
    notificationManager = ((android.app.NotificationManager) (getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(1);
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.tonys.spotifystreamer.services.MediaPlayerService.class);
    stopService(intent);
}