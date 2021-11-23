@java.lang.Override
public void onResponse(org.json.JSONObject jsonObject) {
    android.util.Log.i("Like API Listener", ("json : " + jsonObject));
    if (jsonObject != null) {
        if (jsonObject.optBoolean("match", false)) {
            android.util.Log.i("PROFILE MATCHED", this.profile.getId());
            tinderAPI.addMatchProfile(profile);
        }
    }
}