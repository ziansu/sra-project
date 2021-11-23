public boolean isConnected() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (this.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    if ((activeNetworkInfo != null) || ((activeNetworkInfo.getType()) == (android.net.ConnectivityManager.TYPE_WIFI)))
        return activeNetworkInfo.isConnected();
    else
        return false;
    
}