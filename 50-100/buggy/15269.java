public void updateParameters() {
    pendingTime.set(db.getServerSettingInt("pendingTime"));
    notificationInterval.set(db.getServerSettingInt("notificationInterval"));
    debuggingStatus.set(false);
    notifications = db.getNotifications();
    triggers = ts.getConfiguredDevices(db.getTriggerDevices());
}