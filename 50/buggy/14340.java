public static void d(java.lang.String tag, java.lang.String msg) {
    if (daylemk.xposed.xbridge.utils.Log.debug) {
        daylemk.xposed.xbridge.utils.Log.xposedLog(tag, msg);
        android.util.Log.d(daylemk.xposed.xbridge.utils.Log.getFormattedTag(tag), msg);
    }
}