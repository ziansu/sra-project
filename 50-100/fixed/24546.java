public static boolean isMobile(dennouneko.mabistatus.Context ctx) {
    dennouneko.mabistatus.ConnectivityManager connMgr = ((dennouneko.mabistatus.ConnectivityManager) (ctx.getSystemService(Context.CONNECTIVITY_SERVICE)));
    if (connMgr == null)
        return true;
    
    dennouneko.mabistatus.NetworkInfo info = connMgr.getActiveNetworkInfo();
    if (info == null)
        return true;
    
    dennouneko.mabistatus.Log.v(dennouneko.mabistatus.MainActivity.tag, ("Network type = " + (info.getTypeName())));
    switch (info.getType()) {
        case ConnectivityManager.TYPE_MOBILE :
            return true;
        default :
            return false;
    }
}