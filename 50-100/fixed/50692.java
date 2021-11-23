public static boolean waitForUiObjectEnabled(android.support.test.uiautomator.UiObject2 UiObj, long timeOut, long interval) {
    boolean flag_UiObj_enabled = false;
    long start = android.os.SystemClock.uptimeMillis();
    while ((!(UiObj.isEnabled())) && (((android.os.SystemClock.uptimeMillis()) - start) < timeOut)) {
        flag_UiObj_enabled = UiObj.isEnabled();
        com.example.zhengjin.funsettingsuitest.testutils.ShellUtils.systemWait(interval);
    } 
    return flag_UiObj_enabled;
}