private void onResume() {
    com.chriscartland.octaviastreethilton.auth.AuthManager.AuthCallback callback = null;
    try {
        callback = ((com.chriscartland.octaviastreethilton.auth.AuthManager.AuthCallback) (mActivity));
    } catch (java.lang.ClassCastException e) {
        android.util.Log.e(com.chriscartland.octaviastreethilton.auth.AuthManager.TAG, "Activity must implement AuthCallback interface");
        throw e;
    }
    setAuthCallback(callback);
    updateUserInterfaceCallback();
    mFirebaseAuthManager.setCallback(this);
    mGoogleOAuthManager.setActivity(mActivity);
    mGoogleOAuthManager.setCallback(mFirebaseAuthManager);
    mGoogleOAuthManager.start();
}