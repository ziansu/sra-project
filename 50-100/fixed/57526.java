@java.lang.Override
protected org.springframework.social.oauth2.AccessGrant createAccessGrant(java.lang.String accessToken, java.lang.String scope, java.lang.String refreshToken, java.lang.Long expiresIn, java.util.Map<java.lang.String, java.lang.Object> response) {
    uid = ((java.lang.String) (response.get("x_mailru_vid")));
    return super.createAccessGrant(accessToken, scope, refreshToken, expiresIn, response);
}