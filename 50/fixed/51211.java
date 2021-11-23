@java.lang.SuppressWarnings(value = "deprecation")
private void syncCookies() {
    if ((Build.VERSION.SDK_INT) < 21) {
        android.webkit.CookieSyncManager.createInstance(getApplicationContext());
        android.webkit.CookieSyncManager.getInstance().sync();
    }
}