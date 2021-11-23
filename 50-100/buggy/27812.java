@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    context.startService(new android.content.Intent(context, com.promact.akansh.samplefirebaserestapp.MyService.class));
    if (checkInternet(context)) {
        android.util.Log.d(com.promact.akansh.samplefirebaserestapp.NetworkStatus.TAG, "Network available");
        android.widget.Toast.makeText(context, "Network Available", Toast.LENGTH_SHORT).show();
    }else {
        android.util.Log.d(com.promact.akansh.samplefirebaserestapp.NetworkStatus.TAG, "Network unavailable");
        android.widget.Toast.makeText(context, "Network Unavailable", Toast.LENGTH_SHORT).show();
    }
}