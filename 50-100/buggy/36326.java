private org.apache.cxf.rs.security.oauth2.common.ClientAccessToken getClientAccessToken(org.apache.cxf.rs.security.oauth2.client.Consumer consumer, java.lang.String code, boolean postMessage) {
    org.apache.cxf.rs.security.oauth2.common.AccessTokenGrant grant = new org.apache.cxf.rs.security.oauth2.grants.code.AuthorizationCodeGrant(code);
    java.lang.String redirectUri = (postMessage) ? "postmessage" : getRedirectUri();
    return org.apache.cxf.rs.security.oauth2.client.OAuthClientUtils.getAccessToken(accessTokenServiceClient, consumer, grant, java.util.Collections.singletonMap(OAuthConstants.REDIRECT_URI, redirectUri), false);
}