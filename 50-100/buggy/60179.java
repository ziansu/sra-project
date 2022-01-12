@java.lang.Override
public void printErrStackTrace(java.lang.String tag, java.lang.Throwable tr, java.lang.String format, java.lang.Object... obj) {
    java.lang.String log = (obj == null) ? format : java.lang.String.format(format, obj);
    if (log == null) {
        log = "";
    }
    log += "  " + (android.util.Log.getStackTraceString(tr));
    android.util.Log.e(tag, log);
}