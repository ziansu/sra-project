public static void d(java.lang.String tag, java.lang.String msg) {
    if (daylemk.xposed.xbridge.utils.Log.debug) {
        android.util.Log.d(daylemk.xposed.xbridge.utils.Log.getFormattedTag(tag), msg);
    }
}