public static int ifmt(java.lang.String tag, java.lang.String fmt, java.lang.Object... args) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        java.lang.String msg = java.lang.String.format(java.util.Locale.US, fmt, args);
        return android.util.Log.i(tag, msg);
    }
    return 0;
}