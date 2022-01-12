@java.lang.Override
public void uncaughtException(java.lang.Thread thread, java.lang.Throwable ex) {
    java.lang.String content = com.tns.ErrorReport.getErrorMessage(ex);
    com.tns.Platform.passUncaughtExceptionToJsNative(ex, content);
    if (com.tns.Platform.IsLogEnabled)
        android.util.Log.e(com.tns.Platform.DEFAULT_LOG_TAG, ("Uncaught Exception Message=" + (ex.getMessage())));
    
    boolean errorActivityHasStarted = com.tns.ErrorReport.startActivity(com.tns.Platform.NativeScriptContext, ex);
    if ((!errorActivityHasStarted) && (defaultHandler != null)) {
        defaultHandler.uncaughtException(thread, ex);
    }
}