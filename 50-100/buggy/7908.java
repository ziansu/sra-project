public static void clearNotification() {
    android.content.Intent intent = new android.content.Intent(com.project.nghicv.readingbook.RBApp.getInstance(), com.project.nghicv.readingbook.receiver.NotificationPublisher.class);
    android.app.PendingIntent sender = android.app.PendingIntent.getBroadcast(com.project.nghicv.readingbook.RBApp.getInstance(), com.project.nghicv.readingbook.util.PreferenceUtil.getNotificationId(com.project.nghicv.readingbook.RBApp.getInstance()), intent, PendingIntent.FLAG_CANCEL_CURRENT);
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (com.project.nghicv.readingbook.RBApp.getInstance().getSystemService(android.content.Context.ALARM_SERVICE)));
    alarmManager.cancel(sender);
}