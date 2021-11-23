@java.lang.Override
public void onTokenRefresh() {
    super.onTokenRefresh();
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    java.lang.String android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    storeRegIdInPref(refreshedToken, android_id);
    android.content.Intent registrationComplete = new android.content.Intent(Config.REGISTRATION_COMPLETE);
    registrationComplete.putExtra("token", refreshedToken);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(registrationComplete);
}