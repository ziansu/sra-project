@org.springframework.context.annotation.Bean
public eu.fraho.spring.securityJwt.service.JwtTokenService jwtTokenService() {
    log.debug("Register JwtTokenService");
    return new eu.fraho.spring.securityJwt.service.JwtTokenServiceImpl(jwtTokenConfiguration(), jwtRefreshConfiguration(), jwtTokenCookieConfiguration(), jwtTokenHeaderConfiguration(), jwtRefreshCookieConfiguration(), this::jwtUser);
}