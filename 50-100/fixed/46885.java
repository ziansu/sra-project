public static boolean isFirstAppExecution() {
    java.lang.String firstAppStartValue = com.marcohc.architecture.common.helper.PreferencesHelper.getInstance().getString(com.marcohc.architecture.common.helper.AppInfoHelper.IS_FIRST_APP_EXECUTION, null);
    boolean isFirstAppStart;
    if ((firstAppStartValue == null) || (firstAppStartValue.equals("true"))) {
        isFirstAppStart = true;
        com.marcohc.architecture.common.helper.PreferencesHelper.getInstance().putString(com.marcohc.architecture.common.helper.AppInfoHelper.IS_FIRST_APP_EXECUTION, "false");
    }else {
        isFirstAppStart = false;
        com.marcohc.architecture.common.helper.PreferencesHelper.getInstance().putString(com.marcohc.architecture.common.helper.AppInfoHelper.IS_FIRST_APP_EXECUTION, "false");
    }
    return isFirstAppStart;
}