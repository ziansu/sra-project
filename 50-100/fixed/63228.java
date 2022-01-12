@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.auth0.lock.LockContext.configureLock(new com.auth0.lock.Lock.Builder().loadFromApplication(this).closable(true).useEmail(true).usePKCE(true).fullscreen(false).useWebView(true).withIdentityProvider(Strategies.Facebook, new com.auth0.facebook.FacebookIdentityProvider(this)));
}