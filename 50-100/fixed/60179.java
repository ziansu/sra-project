@java.lang.Override
public void printErrStackTrace(java.lang.String tag, java.lang.Throwable tr, java.lang.String format, java.lang.Object... params) {
    java.lang.String log = ((params == null) || ((params.length) == 0)) ? format : java.lang.String.format(format, params);
    if (log == null) {
        log = "";
    }
    log += "  " + (android.util.Log.getStackTraceString(tr));
    android.util.Log.e(tag, log);
}