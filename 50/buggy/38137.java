@java.lang.Override
protected void onCurrentAccessTokenChanged(com.facebook.AccessToken oldToken, com.facebook.AccessToken newToken) {
    java.lang.String log = (newToken == null) ? "newToken = null" : "newToken != null";
    android.util.Log.i(com.example.ivan.champy_v2.activity.LoginActivity.TAG, log);
}