public boolean statusCheckInt() {
    android.net.ConnectivityManager connectivity = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    if ((connectivity.getActiveNetworkInfo()) != null) {
        if (connectivity.getActiveNetworkInfo().isConnected()) {
            return true;
        }else {
            buildAlertMessageNoInt();
            return false;
        }
    }else {
        buildAlertMessageNoInt();
        return false;
    }
}