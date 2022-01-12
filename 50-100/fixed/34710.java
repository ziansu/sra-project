@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info = cm.getActiveNetworkInfo();
    if (info != null) {
        if (info.isConnected()) {
            android.content.Intent i = new android.content.Intent(context, com.chris.tatusafety.services.SyncService.class);
            context.startService(i);
        }
    }
}