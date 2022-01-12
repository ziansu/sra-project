public static boolean isMobile(dennouneko.mabistatus.Context ctx) {
    dennouneko.mabistatus.ConnectivityManager connMgr = ((dennouneko.mabistatus.ConnectivityManager) (ctx.getSystemService(Context.CONNECTIVITY_SERVICE)));
    dennouneko.mabistatus.NetworkInfo info = connMgr.getActiveNetworkInfo();
    dennouneko.mabistatus.Log.v(dennouneko.mabistatus.MainActivity.tag, ("Network type = " + (info.getTypeName())));
    switch (info.getType()) {
        case ConnectivityManager.TYPE_MOBILE :
            return true;
        default :
            return false;
    }
}