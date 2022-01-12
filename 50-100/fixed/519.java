public static void wtf(java.lang.String tag, java.lang.String msg, java.lang.Throwable exception, boolean checkLoggable) {
    if ((com.vwo.mobile.utils.VWOLog.LEVEL) <= (com.vwo.mobile.utils.VWOLog.SEVERE)) {
        if (checkLoggable) {
            if (android.util.Log.isLoggable(tag, Log.ERROR)) {
                android.util.Log.wtf(tag, msg, exception);
            }
        }else {
            android.util.Log.wtf(tag, msg, exception);
        }
        io.sentry.Sentry.capture(msg);
        io.sentry.Sentry.capture(exception);
    }
}