@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    mAuth.addAuthStateListener(this);
    return super.onStartCommand(intent, flags, startId);
}