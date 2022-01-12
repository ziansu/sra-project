public void authenticate() {
    if ((shouldCheckNetwork) && (!(networkIsConnected())))
        return ;
    
    com.jlubecki.soundcloud.webapi.android.auth.SoundCloudAuthenticator authenticator = updateCurrentAuthenticator();
    if (authenticator != null) {
        authenticator.launchAuthenticationFlow();
    }else {
        java.lang.String errorReason = "No authentication strategy could be prepared.";
        if ((onNetworkFailureListener) != null) {
            java.lang.AssertionError error = new java.lang.AssertionError(errorReason);
            onNetworkFailureListener.onFailure(error);
        }else {
            android.util.Log.e(com.jlubecki.soundcloud.webapi.android.auth.AuthenticationStrategy.TAG, errorReason);
        }
    }
}