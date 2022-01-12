@java.lang.Override
public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult result) {
    callback.onAuthenticated();
}