public static boolean isNetworkOK(android.content.Context context) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    if (cm != null) {
        android.net.NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni != null)
            return ni.isConnected();
        
    }
    return false;
}