private void initAccessTokens(java.lang.String accessToken, java.lang.String refreshToken, java.lang.Long expireTime) {
    this.accessToken = accessToken;
    this.expireTime = expireTime;
    if (refreshToken != null) {
        this.refreshToken = refreshToken;
    }
}