boolean isAppIdleFiltered(java.lang.String packageName, int uidForAppId, int userId, long timeNow) {
    final com.android.server.usage.UserUsageStatsService userService;
    final long screenOnTime;
    synchronized(mLock) {
        if (timeNow == (-1)) {
            timeNow = checkAndGetTimeLocked();
        }
        userService = getUserDataAndInitializeIfNeededLocked(userId, timeNow);
        screenOnTime = getScreenOnTimeLocked();
    }
    return isAppIdleFiltered(packageName, android.os.UserHandle.getAppId(uidForAppId), userId, userService, timeNow, screenOnTime);
}