public static void e(final java.lang.String logTag, final java.lang.String msg, final java.lang.Exception e) {
    if (com.stanko.tools.Log.isDebuggable)
        android.util.Log.e(logTag, msg, e);
    
}