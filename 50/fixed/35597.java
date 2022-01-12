@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    com.techlung.moodtracker.settings.Preferences.initPreferences(context);
    com.techlung.moodtracker.notification.NotificationManager.setNextNotification(context, false);
}