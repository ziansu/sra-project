@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    boolean sentToken = sharedPreferences.getBoolean("sentTokenToServer", false);
    if (sentToken) {
        isTokenHere = true;
        android.util.Log.i("Token", "Received");
    }
}