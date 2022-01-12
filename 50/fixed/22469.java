public static void d(java.lang.String tag, java.lang.String msg) {
    if ((com.vinci.imageloader.core.util.MLog.DEBUG) || (android.text.TextUtils.isEmpty(msg))) {
        return ;
    }
    android.util.Log.d(tag, msg);
}