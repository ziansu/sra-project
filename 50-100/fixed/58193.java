public boolean isConnectingToInternet() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    if ((networkInfo != null) && (networkInfo.isConnected()))
        return true;
    else
        return false;
    
}