@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    accessToken = loginResult.getAccessToken();
    android.widget.Toast.makeText(getApplicationContext(), loginResult.getAccessToken().getUserId(), Toast.LENGTH_LONG).show();
    java.lang.String id = prefs.getString("id", "");
    if (id.equals("")) {
        android.util.Log.e("Getting User Details", "");
        getUserDetails();
    }else {
        android.content.Intent intent = new android.content.Intent(this, bekanjoos.vinaygaba.com.bekanjoos.MainActivity.class);
        startActivity(intent);
    }
}