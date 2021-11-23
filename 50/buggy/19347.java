@java.lang.Override
public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult result) {
    super.onAuthenticationSucceeded(result);
    callback.onAuthenticated();
}