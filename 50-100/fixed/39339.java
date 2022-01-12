public static boolean isNetworkAvailable(android.content.Context context) {
    if (context == null)
        return false;
    
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return (activeNetworkInfo != null) && (activeNetworkInfo.isConnected());
}