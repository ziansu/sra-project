public static boolean checkInternetConnection(android.content.Context context) {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    if ((connectivityManager.getActiveNetworkInfo()) != null) {
        if ((connectivityManager.getActiveNetworkInfo().isConnected()) && (connectivityManager.getActiveNetworkInfo().isAvailable())) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}