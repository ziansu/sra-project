private java.util.Collection<org.springframework.security.oauth2.common.OAuth2AccessToken> addToCollection(final java.util.Collection<org.springframework.security.oauth2.common.OAuth2AccessToken> store, final org.springframework.security.oauth2.common.OAuth2AccessToken token) {
    store.add(token);
    return store;
}