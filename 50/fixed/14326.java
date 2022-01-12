public static boolean isPassedDeadline() {
    long currentTime = java.lang.System.currentTimeMillis();
    long deadlineTime = edu.berkeley.icsi.sensormonitor.utils.PreferencesWrapper.getDailyDeadline();
    return currentTime > deadlineTime;
}