private void emitNotification(int resNum, java.lang.String event) {
    android.content.res.Resources res = getResources();
    android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(this).setSmallIcon(R.drawable.notif_icon).setContentTitle(res.getString(R.string.mode_sonnerie_change)).setContentText((((res.getString(resNum)) + " ") + event));
    android.app.NotificationManager notifManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    notifManager.notify(uk.co.yahoo.p1rpp.calendartrigger.service.MuteService.NOTIFY_ID, builder.build());
}