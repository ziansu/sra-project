public static void wtf(java.lang.String tag, java.lang.Throwable exception, boolean checkLoggable) {
    if ((com.vwo.mobile.utils.VWOLog.LEVEL) <= (com.vwo.mobile.utils.VWOLog.SEVERE)) {
        if (checkLoggable) {
            if (android.util.Log.isLoggable(tag, Log.ERROR)) {
                io.sentry.Sentry.capture(exception);
                android.util.Log.wtf(tag, exception);
            }
        }else {
            io.sentry.Sentry.capture(exception);
            android.util.Log.wtf(tag, exception);
        }
    }
}