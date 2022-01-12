public void d(java.lang.String tag, java.lang.String message, java.lang.Throwable e) {
    if ((level) >= (com.zanjou.http.debug.Logger.DEBUG)) {
        if (e != null) {
            android.util.Log.i(tag, message, e);
        }else {
            android.util.Log.i(tag, message);
        }
    }
}