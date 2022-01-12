public boolean internetControl(android.content.Context ctx) {
    android.net.ConnectivityManager conMgr = ((android.net.ConnectivityManager) (ctx.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo i = conMgr.getActiveNetworkInfo();
    if (i == null)
        return false;
    
    if (!(i.isConnected()))
        return false;
    
    if (!(i.isAvailable()))
        return false;
    
    return true;
}