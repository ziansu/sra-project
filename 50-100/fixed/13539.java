public static boolean isDataEnabled(android.content.Context context) {
    boolean dataEnabled = false;
    android.net.NetworkInfo activeNetworkInfo = com.apps.ajay.wifiboy.NetworkConnectionManager.getNetworkInfo(context);
    if ((activeNetworkInfo != null) && ((activeNetworkInfo.getType()) == (android.net.ConnectivityManager.TYPE_MOBILE))) {
        dataEnabled = (activeNetworkInfo.getType()) == (android.net.ConnectivityManager.TYPE_MOBILE);
    }
    return dataEnabled;
}