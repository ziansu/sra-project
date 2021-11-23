@java.lang.Override
public void init() {
    preferencesUtil = new com.arrg.app.uapplock.util.SharedPreferencesUtil(this);
    lockedAppsPreferences = getSharedPreferences(UAppLock.LOCKED_APPS_PREFERENCES, Context.MODE_PRIVATE);
    packagesAppsPreferences = getSharedPreferences(UAppLock.PACKAGES_APPS_PREFERENCES, Context.MODE_PRIVATE);
    lockedPackages = new java.util.HashMap<>();
    unlockMap = new java.util.HashMap<>();
    packagesHandler = new android.os.Handler();
    packagesMonitor = new com.arrg.app.uapplock.model.runnable.PackagesMonitor(this);
    updatesHandler = new android.os.Handler();
    updatesMonitor = new com.arrg.app.uapplock.model.runnable.UpdatesMonitor(this);
}