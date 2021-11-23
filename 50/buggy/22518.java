@android.support.annotation.Nullable
@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "onBind");
    return mBinder;
}