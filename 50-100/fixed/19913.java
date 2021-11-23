public boolean isNetworkEnabled(boolean onlyWifiAllowed) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(com.mojang.minecraftpe.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info;
    if (onlyWifiAllowed)
        info = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
    else
        info = cm.getActiveNetworkInfo();
    
    return (info != null) && (info.isConnected());
}