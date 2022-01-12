public static void buildNotification(android.content.Context ctx, java.lang.String title, java.lang.String content) {
    android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(ctx).setSmallIcon(R.mipmap.ic_cloudfit).setContentTitle(title).setContentText(content);
    builder.setVibrate(new long[]{ 1000 , 1000 , 1000 });
    android.app.NotificationManager manager = ((android.app.NotificationManager) (ctx.getSystemService(Context.NOTIFICATION_SERVICE)));
    manager.notify(0, builder.build());
    com.alejandro_castilla.cloudfitforwear.utilities.Utilities.vibrate(ctx, 300);
}