@java.lang.Override
public void onAuthenticationError(int errorCode, java.lang.CharSequence errString) {
    super.onAuthenticationError(errorCode, errString);
    if (errorCode == (FINGERPRINT_ERROR_CANCELED)) {
        isCancelled = true;
    }
    if ((promise) == null) {
        throw new java.lang.AssertionError("Tried to reject the auth promise, but it was already resolved / rejected. This shouldn't happen.");
    }
    promise.reject(java.lang.Integer.toString(errorCode), errString.toString());
    promise = null;
}