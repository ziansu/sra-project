@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (isDebugging) {
        android.util.Log.d(com.flybuy.cordova.location.BackgroundLocationUpdateService.TAG, "- Sync local db started by alarm");
    }
    android.content.Intent serviceIntent = new android.content.Intent(this, com.flybuy.cordova.location.BackgroundLocationUploadService.class);
    serviceIntent.putExtra(BackgroundLocationUploadService.URL_EXTRA, syncUrl);
    serviceIntent.putExtra(BackgroundLocationUploadService.TOKEN_EXTRA, deviceToken);
    startService(serviceIntent);
}