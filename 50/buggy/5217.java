@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "onStartCommand");
    mAuth.addAuthStateListener(this);
    return super.onStartCommand(intent, flags, startId);
}