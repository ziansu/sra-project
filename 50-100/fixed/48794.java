private org.wso2.carbon.identity.oauth2.validators.OAuth2TokenValidator findAccessTokenValidator(org.wso2.carbon.identity.oauth2.dto.OAuth2TokenValidationRequestDTO.OAuth2AccessToken accessToken) throws org.wso2.carbon.identity.oauth2.IdentityOAuth2Exception {
    if (accessToken == null) {
        throw new java.lang.IllegalArgumentException("Access token is not present in the validation request");
    }
    java.lang.String accessTokenIdentifier = accessToken.getIdentifier();
    if (accessTokenIdentifier == null) {
        throw new java.lang.IllegalArgumentException("Access token identifier is not present in the validation request");
    }
    org.wso2.carbon.identity.oauth2.validators.OAuth2TokenValidator tokenValidator = tokenValidators.get(accessToken.getTokenType());
    if (tokenValidator == null) {
        throw new java.lang.IllegalArgumentException(("Unsupported access token type: " + (accessToken.getTokenType())));
    }
    return tokenValidator;
}