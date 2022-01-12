public static boolean isNetworkOK(android.app.Activity activity) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (activity.getSystemService(Context.CONNECTIVITY_SERVICE)));
    if (cm != null) {
        android.net.NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni != null)
            return ni.isConnected();
        
    }
    return false;
}