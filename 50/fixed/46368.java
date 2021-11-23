public static boolean isAutoLocked() {
    return (java.lang.System.currentTimeMillis()) < (com.adsamcik.signalcollector.Services.TrackerService.lockedUntil);
}