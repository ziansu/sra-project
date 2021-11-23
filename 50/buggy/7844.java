private final org.bbqapp.android.auth.AuthCallback unsetCallback() {
    org.bbqapp.android.auth.AuthCallback cb = authCallback;
    authCallback = null;
    return cb;
}