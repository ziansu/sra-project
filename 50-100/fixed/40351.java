public boolean isOnline() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(org.eclipse.paho.android.service.CONNECTIVITY_SERVICE)));
    if (((((cm != null) && ((cm.getActiveNetworkInfo()) != null)) && (cm.getActiveNetworkInfo().isAvailable())) && (cm.getActiveNetworkInfo().isConnected())) && (backgroundDataEnabled)) {
        return true;
    }
    return false;
}