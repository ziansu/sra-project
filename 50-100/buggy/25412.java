protected boolean checkConnection() {
    android.net.ConnectivityManager connectChecker = ((android.net.ConnectivityManager) (getActivity().getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo wifiInfo = connectChecker.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
    if ((wifiInfo != null) && (wifiInfo.isConnected())) {
        return true;
    }
    wifiInfo = connectChecker.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
    if ((wifiInfo != null) && (wifiInfo.isConnected())) {
        return true;
    }
    return false;
}