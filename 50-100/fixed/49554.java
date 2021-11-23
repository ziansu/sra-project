private static NotificationCompat.Action ignoreReminder(android.content.Context context) {
    android.content.Intent ignoreReminderIntent = new android.content.Intent(context, com.vribeiro.workout.services.GoToGymReminderIntentService.class);
    ignoreReminderIntent.setAction(ReminderTasks.DISMISS_NOTIFICATION_ACTION);
    android.app.PendingIntent ignoreReminderPendingIntent = android.app.PendingIntent.getService(context, 14, ignoreReminderIntent, PendingIntent.FLAG_UPDATE_CURRENT);
    return new android.support.v4.app.NotificationCompat.Action(R.drawable.ic_plus, context.getString(R.string.ignore_reminder), ignoreReminderPendingIntent);
}