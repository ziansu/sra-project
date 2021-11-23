@java.lang.Override
public void run() {
    android.app.NotificationManager manager = ((android.app.NotificationManager) (getSystemService(com.example.yqhok.coolweather.service.NOTIFICATION_SERVICE)));
    android.app.Notification notification = new android.support.v4.app.NotificationCompat.Builder(this).setContentTitle("CoolWeather").setContentText("有一条新的天气信息").setWhen(java.lang.System.currentTimeMillis()).setSmallIcon(R.mipmap.ic_launcher).setLargeIcon(android.graphics.BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)).setContentIntent(pi).setAutoCancel(true).build();
    manager.notify(id, notification);
}