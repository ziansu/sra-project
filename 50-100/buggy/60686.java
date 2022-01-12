private boolean hasInternetConnection() {
    android.net.ConnectivityManager connMgr = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
    boolean isWifiConn = networkInfo.isConnected();
    networkInfo = connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
    boolean isMobileConn = networkInfo.isConnected();
    return isWifiConn || isMobileConn;
}