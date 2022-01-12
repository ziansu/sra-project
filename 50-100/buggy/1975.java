boolean offline_login() {
    java.lang.String account = sharedPreferences.getString("account", null);
    java.lang.String passwd = sharedPreferences.getString("passwd", null);
    android.util.Log.d("Tag", "fake login");
    return (!(account == null)) || (passwd == null);
}