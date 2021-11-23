public static void i(java.lang.String tag, java.lang.String msg) {
    daylemk.xposed.xbridge.utils.Log.xposedLog(tag, msg);
    android.util.Log.i(daylemk.xposed.xbridge.utils.Log.getFormattedTag(tag), msg);
}