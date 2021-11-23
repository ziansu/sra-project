protected static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send, boolean logToLogcat, java.lang.String tag) {
    com.binarapps.android.cookielogger.AppContext.instance = new com.binarapps.android.cookielogger.AppContext(context, send);
}