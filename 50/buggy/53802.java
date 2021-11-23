public com.hkm.disqus.api.AuthTokenServiceManager createAuthenticationManager(android.content.Context contex) {
    return new com.hkm.disqus.api.AuthTokenServiceManager(contex, createTokenService(), _config);
}