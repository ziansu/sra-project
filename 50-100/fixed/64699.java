@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    accessToken = loginResult.getAccessToken();
    android.content.SharedPreferences.Editor e = mSharedPreferences.edit();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = gson.toJson(accessToken);
    e.putString("fb_access_token", json);
    e.commit();
    android.widget.Toast.makeText(getActivity(), "Login Success!", Toast.LENGTH_LONG).show();
}