@java.lang.Override
public void onAuthenticationError(int errorCode, java.lang.CharSequence errString) {
    if (!(isCancelled)) {
        callback.onError(errString.toString());
    }
}