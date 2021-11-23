int addAlarm() {
    return addAlarm(true, "fully_charged", "", android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.toString(), "notification", false, true);
}