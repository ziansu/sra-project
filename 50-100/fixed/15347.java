public void onClick(android.content.DialogInterface dialog, int id) {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (this.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    if (!((networkInfo != null) && (networkInfo.isConnected()))) {
        if (((noInternetConnection) == null) || (!(noInternetConnection.isShowing())))
            noInternetConnection = new com.leaf.clips.presenter.NoInternetAlert().show(this);
        
    }else
        informationManager.downloadMapOfVisibleBeacons(true);
    
}