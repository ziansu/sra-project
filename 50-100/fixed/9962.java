@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.app.Notification noti = new android.app.Notification.Builder(this).setContentTitle("^____^").setContentText("I'm Your Pet!").setSmallIcon(R.mipmap.ic_launcher).setOngoing(true).build();
    startForeground(com.air.petphone.KillNotificationService.NOTIFICATION_ID, noti);
    return START_STICKY;
}