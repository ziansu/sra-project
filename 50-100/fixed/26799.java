@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent serviceIntent = new android.content.Intent(context, org.jboss.aerogear.android.sync.SyncService.class);
    serviceIntent.putExtra(SyncService.MESSAGE_INTENT, intent);
    context.startService(serviceIntent);
    android.os.Bundle extras = intent.getExtras();
    if (!(extras.isEmpty())) {
        android.util.Log.i(TAG, ("Received: " + (extras.toString())));
    }
}