private boolean isInternetConnectionAvailable() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
    return activeNetwork.isConnectedOrConnecting();
}