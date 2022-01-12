static boolean isRootForAppsEnabled() {
    int value = android.os.SystemProperties.getInt(com.android.settings.DevelopmentSettings.ROOT_ACCESS_PROPERTY, 0);
    boolean daemonState = android.os.SystemProperties.get("init.svc.su_daemon", "absent").equals("running");
    return daemonState && ((value == 1) || (value == 3));
}