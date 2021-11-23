public static boolean isWifiConnected(android.content.Context context) {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info = connectivityManager.getActiveNetworkInfo();
    return ((info != null) && (info.isConnected())) && (info.getTypeName().equals("WIFI"));
}