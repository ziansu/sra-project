@java.lang.Override
public void onCreate() {
    super.onCreate();
    lock = new com.auth0.lock.LockBuilder().loadFromApplication(this).closable(true).build();
    lock.setProvider(Strategies.Facebook.getName(), new com.auth0.facebook.FacebookIdentityProvider());
    lock.setProvider(Strategies.GooglePlus.getName(), new com.auth0.googleplus.GooglePlusIdentityProvider(this));
}