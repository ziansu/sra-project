@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.net.ConnectivityManager connMgr = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo wifi = connMgr.getActiveNetworkInfo();
    boolean isAvailable = (wifi != null) && (wifi.isAvailable());
    suppressMultipleLogs(isAvailable, wasAvailable, "network connection (wifi): available", "network connection (wifi): not available");
    boolean isConnected = (wifi != null) && (wifi.isConnectedOrConnecting());
    suppressMultipleLogs(isConnected, wasConnected, "network connection (wifi): enabled/connected", "network connection (wifi): disabled/disconnected");
}