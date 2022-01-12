@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    ru.spbau.mit.foodmanager.NotificationSettings.saveNotificationSettings(this);
}