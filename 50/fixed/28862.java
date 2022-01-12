private boolean isInternetAvailable() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (this.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
    return (activeNetwork != null) && (activeNetwork.isConnectedOrConnecting());
}