public static void i(java.lang.String msg) {
    if (android.text.TextUtils.isEmpty(msg)) {
        return ;
    }
    if (com.vinci.imageloader.core.util.MLog.DEBUG) {
        android.util.Log.i(com.vinci.imageloader.core.util.MLog.TAG, msg);
    }
}