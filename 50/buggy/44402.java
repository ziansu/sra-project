@java.lang.Override
protected java.lang.String getUserInfoEndpoint(org.apache.oltu.oauth2.client.response.OAuthClientResponse token, java.util.Map<java.lang.String, java.lang.String> authenticatorProperties) {
    java.lang.String userGUID = token.getParam(YahooOAuth2AuthenticatorConstants.USER_GUID);
    java.lang.String url = ((getUserInfoURL()) + userGUID) + (YahooOAuth2AuthenticatorConstants.YAHOO_USER_DETAILS_JSON);
    return url;
}