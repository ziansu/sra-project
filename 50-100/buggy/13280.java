public static final boolean isOnline(android.content.Context context) {
    android.net.ConnectivityManager conMgr = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    if ((((conMgr.getActiveNetworkInfo()) != null) && (conMgr.getActiveNetworkInfo().isAvailable())) && (conMgr.getActiveNetworkInfo().isConnected()))
        return true;
    
    return false;
}