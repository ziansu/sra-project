public static final boolean isOnline(android.content.Context context) {
    android.net.ConnectivityManager conMgr = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    return (((conMgr.getActiveNetworkInfo()) != null) && (conMgr.getActiveNetworkInfo().isAvailable())) && (conMgr.getActiveNetworkInfo().isConnected());
}