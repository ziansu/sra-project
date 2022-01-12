@java.lang.Override
public void onCreate() {
    super.onCreate();
    java.util.Map<java.lang.String, java.lang.Object> params = com.auth0.api.ParameterBuilder.newBuilder().asDictionary();
    lock = new com.auth0.lock.LockBuilder().loadFromApplication(this).closable(true).authenticationParameters(params).build();
    lock.setProvider(Strategies.Facebook.getName(), new com.auth0.facebook.FacebookIdentityProvider());
    lock.setProvider(Strategies.GooglePlus.getName(), new com.auth0.googleplus.GooglePlusIdentityProvider(this));
}