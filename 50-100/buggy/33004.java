public void statusCheckInt() {
    android.net.ConnectivityManager connectivity = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    if ((connectivity.getActiveNetworkInfo()) != null) {
        if (connectivity.getActiveNetworkInfo().isConnected()) {
        }else
            buildAlertMessageNoInt();
        
    }else
        buildAlertMessageNoInt();
    
}