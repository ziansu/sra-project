@java.lang.Override
public void onAuthenticationSucceeded(android.support.v4.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult result) {
    super.onAuthenticationSucceeded(result);
    if ((promise) == null) {
        throw new java.lang.AssertionError("Tried to resolve the auth promise, but it was already resolved / rejected. This shouldn't happen.");
    }
    promise.resolve(null);
    promise = null;
}