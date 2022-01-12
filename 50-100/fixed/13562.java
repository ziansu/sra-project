@java.lang.Override
public void onTokenRefresh() {
    new com.humaniq.apilib.storage.Prefs(getApplicationContext());
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d(com.humaniq.apilib.fcm.HumaniqFirebaseInstanceIDService.TAG, ("Refreshed token: " + refreshedToken));
    com.humaniq.apilib.storage.Prefs.saveFCMToken(refreshedToken);
    if (com.humaniq.apilib.storage.Prefs.hasToken()) {
        try {
            sendRegistrationToServer(refreshedToken);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    try {
        sendRegistrationToServer(refreshedToken);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}