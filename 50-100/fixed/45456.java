@java.lang.Override
public void onAuthenticationError(int errorCode, java.lang.CharSequence errString) {
    super.onAuthenticationError(errorCode, errString);
    if (errorCode == (FINGERPRINT_ERROR_CANCELED)) {
        isCancelled = true;
    }
    if ((promise) == null) {
        return ;
    }
    promise.reject(java.lang.Integer.toString(errorCode), errString.toString());
    promise = null;
}