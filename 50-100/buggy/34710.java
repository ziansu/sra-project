@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info = cm.getActiveNetworkInfo();
    if (info != null) {
        if (info.isConnected()) {
            android.widget.Toast.makeText(context, "Tuliwasha sync service", Toast.LENGTH_SHORT).show();
            android.content.Intent i = new android.content.Intent(context, com.chris.tatusafety.services.SyncService.class);
            context.startService(i);
        }
    }
}