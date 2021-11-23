@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
public boolean isConnectedToWifi() {
    final android.net.ConnectivityManager conMan = ((android.net.ConnectivityManager) (mIitc.getSystemService(Context.CONNECTIVITY_SERVICE)));
    final android.net.NetworkInfo wifi = conMan.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
    if (conMan.isActiveNetworkMetered())
        return false;
    
    return (wifi.getState()) == (NetworkInfo.State.CONNECTED);
}