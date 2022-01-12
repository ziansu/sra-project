@java.lang.Override
public void onAuthenticateFailed() {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(br.org.cesar.knot.beamsensor.ui.login.LoginActivity.this, R.string.text_authentication_failed, Toast.LENGTH_SHORT).show();
        }
    });
}