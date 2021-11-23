public void e(java.lang.String tag, java.lang.String message, java.lang.Throwable e) {
    if (e != null) {
        android.util.Log.e(tag, message, e);
    }else {
        android.util.Log.e(tag, message);
    }
}