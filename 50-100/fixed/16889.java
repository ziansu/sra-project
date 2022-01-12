private java.lang.String retrieveAccessToken() {
    android.content.SharedPreferences prefs = getSharedPreferences(getString(R.string.shared_pref_dropbox_account), Context.MODE_PRIVATE);
    java.lang.String accessToken = prefs.getString(getString(R.string.dropbox_access_token), null);
    if (accessToken == null) {
        android.util.Log.i("AccessToken Status", "No token found");
        return null;
    }else {
        android.util.Log.i("AccessToken Status", "Token exists");
        return accessToken;
    }
}