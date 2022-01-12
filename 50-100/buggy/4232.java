private android.net.NetworkInfo getConnectivityManager() {
    final android.content.Context appContext = mApplicationContext;
    if (null == appContext) {
        return null;
    }
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (appContext.getSystemService(Context.CONNECTIVITY_SERVICE)));
    if (cm == null) {
        android.util.Log.e(org.mozilla.gecko.GeckoNetworkManager.LOGTAG, "Connectivity service does not exist");
        return null;
    }
    android.net.NetworkInfo ni = null;
    try {
        ni = cm.getActiveNetworkInfo();
    } catch (java.lang.SecurityException se) {
    }
    return ni;
}