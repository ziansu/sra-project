public boolean connectedToWifi() {
    if ((context) == null)
        return false;
    
    android.net.ConnectivityManager manager = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info = manager.getActiveNetworkInfo();
    if (info == null)
        return false;
    
    if (((info.getType()) == (android.net.ConnectivityManager.TYPE_WIFI)) && ((info.getState()) == (NetworkInfo.State.CONNECTED)))
        return true;
    
    return false;
}