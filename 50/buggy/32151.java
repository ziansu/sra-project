public static int i(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        return android.util.Log.i(tag, msg, tr);
    }
    return 0;
}