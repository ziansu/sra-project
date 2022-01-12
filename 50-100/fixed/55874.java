@org.jetbrains.annotations.NotNull
protected eu.fraho.spring.securityJwt.service.JwtTokenService getService(@org.jetbrains.annotations.NotNull
eu.fraho.spring.securityJwt.ut.service.JwtTokenConfiguration tokenConfiguration, @org.jetbrains.annotations.NotNull
eu.fraho.spring.securityJwt.ut.service.JwtRefreshConfiguration refreshConfiguration, @org.jetbrains.annotations.NotNull
eu.fraho.spring.securityJwt.service.RefreshTokenStore refreshTokenStore, @org.jetbrains.annotations.NotNull
eu.fraho.spring.securityJwt.dto.JwtUser jwtUser, @org.jetbrains.annotations.NotNull
eu.fraho.spring.securityJwt.ut.service.JwtTokenCookieConfiguration tokenCookieConfiguration, @org.jetbrains.annotations.NotNull
eu.fraho.spring.securityJwt.ut.service.JwtTokenHeaderConfiguration tokenHeaderConfiguration, @org.jetbrains.annotations.NotNull
eu.fraho.spring.securityJwt.ut.service.JwtRefreshCookieConfiguration refreshCookieConfiguration) {
    eu.fraho.spring.securityJwt.service.JwtTokenServiceImpl tokenService = new eu.fraho.spring.securityJwt.service.JwtTokenServiceImpl(tokenConfiguration, refreshConfiguration, tokenCookieConfiguration, tokenHeaderConfiguration, refreshCookieConfiguration, () -> jwtUser);
    tokenService.afterPropertiesSet();
    tokenService.setRefreshTokenStore(refreshTokenStore);
    return tokenService;
}