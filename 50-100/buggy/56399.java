public static boolean isNetworkConnected(android.content.Context context) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
    if ((activeNetwork == null) && (!(activeNetwork.isConnectedOrConnecting()))) {
        return false;
    }else
        return true;
    
}