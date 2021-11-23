public static boolean isTimeForAutoUpdateCheck(long lastUpdateCheck, java.lang.String autoUpdateFreq) {
    int checkEveryNDays;
    if (CommCarePreferences.FREQUENCY_DAILY.equals(autoUpdateFreq)) {
        checkEveryNDays = 1;
    }else {
        checkEveryNDays = 7;
    }
    long duration = (android.text.format.DateUtils.DAY_IN_MILLIS) * checkEveryNDays;
    return org.commcare.utils.PendingCalcs.isPending(lastUpdateCheck, duration);
}