public static boolean isFirstUseToday() {
    long lastUseTime = com.marcohc.architecture.common.helper.PreferencesHelper.getInstance().getLong(com.marcohc.architecture.common.helper.AppInfoHelper.LAST_APP_EXECUTION, java.lang.System.currentTimeMillis());
    return !(com.marcohc.architecture.common.helper.DateHelper.isInTheSameDayOfCurrentDate(lastUseTime));
}