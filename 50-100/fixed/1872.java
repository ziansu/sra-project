@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = cm.getActiveNetworkInfo();
    if ((networkInfo != null) && (networkInfo.isConnected())) {
        dispatchConnected();
    }else {
        displatchDisconnected();
    }
}