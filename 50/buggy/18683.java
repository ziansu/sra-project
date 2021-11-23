public void registerAuthenticationListener(com.concavenp.artistrymuse.services.UserAuthenticationService.OnAuthenticationListener listener) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "Auth listener has been registered");
    mAuthListener = listener;
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "Listening for Auth changes");
}