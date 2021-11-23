public void onLoginFailed() {
    android.widget.Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
    _loginButton.setEnabled(true);
}