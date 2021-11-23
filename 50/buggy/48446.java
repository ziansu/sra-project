public static void turnOnReminders(android.app.Activity activity, org.a5calls.android.a5calls.model.AccountManager manager) {
    if (manager.getAllowReminders(activity)) {
        org.a5calls.android.a5calls.model.NotificationUtils.setNotificationTime(activity, manager.getReminderMinutes(activity));
    }else {
        org.a5calls.android.a5calls.model.NotificationUtils.clearNotifications(activity);
    }
}