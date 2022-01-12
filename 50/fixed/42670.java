public static void i(java.lang.String msg) {
    if ((com.vinci.imageloader.core.util.MLog.DEBUG) || (android.text.TextUtils.isEmpty(msg))) {
        return ;
    }
    android.util.Log.i(com.vinci.imageloader.core.util.MLog.TAG, msg);
}