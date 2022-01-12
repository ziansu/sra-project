private static boolean canEnable() {
    return (Preferences.Account.Username.exists()) && (java.lang.Boolean.TRUE.equals(Preferences.NotificationPolling.IsEnabled.get()));
}