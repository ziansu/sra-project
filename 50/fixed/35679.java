private void initialize() {
    java.security.Security.addProvider(new com.einzig.ipst2.oauth.OAuth2Authenticator.OAuth2Provider());
}