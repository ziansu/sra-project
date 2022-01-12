private boolean isOnline() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(in.dc297.mqttclpro.CONNECTIVITY_SERVICE)));
    if ((((cm.getActiveNetworkInfo()) != null) && (cm.getActiveNetworkInfo().isAvailable())) && (cm.getActiveNetworkInfo().isConnected())) {
        return true;
    }
    return false;
}