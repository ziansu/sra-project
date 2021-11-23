public static boolean isConnected(android.content.Context context) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info = cm.getActiveNetworkInfo();
    return (info != null) && (info.isConnected());
}