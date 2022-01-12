@java.lang.Override
public void onDestroy() {
    android.util.Log.d(fi.aalto.mobilesystems.ledcontrol.activities.SelectLightColorActivity.TAG, "onDestroy");
    super.onDestroy();
    if ((msharedPrefs) == null)
        return ;
    
    android.content.SharedPreferences.Editor prefsEditor = msharedPrefs.edit();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = gson.toJson(mBroadcastScene);
    prefsEditor.putString("HandleBroadcastScene", json);
    prefsEditor.commit();
    android.util.Log.d(fi.aalto.mobilesystems.ledcontrol.activities.SelectLightColorActivity.TAG, ("toJson: " + json));
}