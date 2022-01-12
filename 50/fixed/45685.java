private void onMissingDisplayNamesComplete(java.lang.StringBuffer debugMessage) {
    if (debugMessage != null) {
        android.util.Log.w(Global.LOG_CONTEXT, ((mDebugPrefix) + debugMessage));
    }
}