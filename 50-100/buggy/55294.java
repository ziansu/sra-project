@java.lang.Override
protected void onStart() {
    super.onStart();
    bindService(new android.content.Intent(this, com.notorious.smoothproxy.MainService.class), mConnection, com.notorious.smoothproxy.BIND_AUTO_CREATE);
    etUsername.setText(mPreferences.getString("username", ""));
    etPassword.setText(mPreferences.getString("password", ""));
    etService.setText(mPreferences.getString("service", ""));
    etServer.setText(mPreferences.getString("server", ""));
}