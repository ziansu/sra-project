public boolean isConnectingToInternet() {
    android.net.ConnectivityManager connectivity = ((android.net.ConnectivityManager) (_context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    if (connectivity != null) {
        android.net.NetworkInfo[] info = connectivity.getAllNetworkInfo();
        if (info != null)
            for (int i = 0; i < (info.length); i++)
                if ((info[i].getState()) == (NetworkInfo.State.CONNECTED)) {
                    return false;
                }
            
        
    }
    return true;
}