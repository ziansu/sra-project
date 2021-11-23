public static long endAction(java.lang.String actionName, boolean isCheckLevel) {
    long resultTime = 0L;
    if ((by.istin.android.xcore.utils.Log.sIsDebug) || isCheckLevel) {
        java.lang.Long startTime = by.istin.android.xcore.utils.Log.sActionStorage.get(actionName);
        if (startTime != null) {
            resultTime = (java.lang.System.currentTimeMillis()) - startTime;
            by.istin.android.xcore.utils.Log.d(by.istin.android.xcore.utils.Log.TIME_ACTION, ((actionName + ":") + resultTime));
        }
        by.istin.android.xcore.utils.Log.sActionStorage.remove(actionName);
    }
    return resultTime;
}