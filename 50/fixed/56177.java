@java.lang.Override
protected java.lang.String getTokenEndpoint(java.util.Map<java.lang.String, java.lang.String> authenticatorProperties) {
    return authenticatorProperties.get(GoogleOAuth2AuthenticationConstant.GOOGLE_TOKEN_ENDPOINT);
}