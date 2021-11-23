public static long endAction(java.lang.String actionName, boolean isCheckLevel) {
    long resultTime = 0L;
    if ((by.istin.android.xcore.utils.Log.sIsDebug) || isCheckLevel) {
        if ((by.istin.android.xcore.utils.Log.sActionStorage.get(actionName)) != null) {
            resultTime = (java.lang.System.currentTimeMillis()) - (by.istin.android.xcore.utils.Log.sActionStorage.get(actionName));
            by.istin.android.xcore.utils.Log.d(by.istin.android.xcore.utils.Log.TIME_ACTION, ((actionName + ":") + resultTime));
        }
        by.istin.android.xcore.utils.Log.sActionStorage.remove(actionName);
    }
    return resultTime;
}