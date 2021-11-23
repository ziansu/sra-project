@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    java.lang.String token = intent.getStringExtra(Prefs.FIREBASE_ID);
    android.util.Log.d(com.hillelevo.cityelf.Constants.TAG, ("MainActivity onReceive: " + action));
    android.util.Log.d(com.hillelevo.cityelf.Constants.TAG, ("MainActivity onReceive: " + token));
    if (active) {
    }
}