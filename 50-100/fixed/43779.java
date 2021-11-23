public boolean isNetworkAvaibleAndConnected() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(com.gmail.halfik.btcprice.service.CONNECTIVITY_SERVICE)));
    if (cm == null) {
        return false;
    }
    boolean isNetworkAvaible = (cm.getActiveNetworkInfo()) != null;
    boolean isNetworkConneted = isNetworkAvaible && (cm.getActiveNetworkInfo().isConnected());
    return isNetworkConneted;
}