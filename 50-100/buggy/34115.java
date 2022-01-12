@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    boolean sentToken = sharedPreferences.getBoolean("sentTokenToServer", false);
    if (sentToken) {
        isTokenHere = true;
        android.util.Log.i("Token", "Received");
    }else {
        chat.mobilecomputationproject.activities.splashscreen.SplashscreenActivity.parent.runOnUiThread(new java.lang.Runnable() {
            public void run() {
                android.widget.Toast.makeText(chat.mobilecomputationproject.activities.splashscreen.SplashscreenActivity.parent.getBaseContext(), R.string.token_problem, Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}