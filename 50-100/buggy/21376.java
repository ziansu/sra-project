@java.lang.Override
protected org.springframework.security.oauth2.common.OAuth2AccessToken getAccessToken(final org.springframework.security.oauth2.provider.ClientDetails client, final org.springframework.security.oauth2.provider.TokenRequest tokenRequest) {
    org.springframework.security.oauth2.provider.OAuth2Authentication auth = getOAuth2Authentication(client, tokenRequest);
    org.springframework.security.oauth2.common.OAuth2AccessToken accessToken = tokenServices.createAccessToken(auth);
    accessToken.getAdditionalInformation().put("issued_token_type", it.infn.mw.iam.core.oauth.TokenExchangeTokenGranter.TOKEN_TYPE);
    java.lang.String audience = tokenRequest.getRequestParameters().get(it.infn.mw.iam.core.oauth.TokenExchangeTokenGranter.AUDIENCE_FIELD);
    if (!(com.google.common.base.Strings.isNullOrEmpty(audience))) {
        accessToken.getAdditionalInformation().put(it.infn.mw.iam.core.oauth.TokenExchangeTokenGranter.AUDIENCE_FIELD, audience);
    }
    return accessToken;
}