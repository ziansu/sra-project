@java.lang.Override
protected void onDestroy() {
    ru.spbau.mit.foodmanager.NotificationSettings.saveNotificationSettings(this);
}