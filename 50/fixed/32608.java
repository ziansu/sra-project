@java.lang.Override
protected void onPreExecute() {
    userClassControl = fga.mds.gpp.trezentos.Controller.UserClassControl.getInstance(com.facebook.FacebookSdk.getApplicationContext());
    android.content.SharedPreferences session = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext());
    email = session.getString("userEmail", "");
}