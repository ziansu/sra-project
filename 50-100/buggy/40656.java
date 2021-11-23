@java.lang.Override
protected void addAccessTokenToProfile(final U profile, final com.github.scribejava.core.model.OAuth1Token accessToken) {
    if (profile != null) {
        final java.lang.String token = accessToken.getToken();
        org.pac4j.oauth.client.BaseOAuth10Client.logger.debug("add access_token: {} to profile", token);
        profile.setAccessToken(token);
    }
    profile.setAccessSecret(accessToken.getTokenSecret());
}