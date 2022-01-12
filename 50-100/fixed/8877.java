public void update() {
    pendingTime.set(db.getServerSettingInt("pendingTime"));
    notificationInterval.set(db.getServerSettingInt("notificationInterval"));
    notifications = db.getNotifications();
    triggers = ts.getConfiguredDevices(db.getTriggerDevices());
}