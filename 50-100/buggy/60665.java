@java.lang.Override
public net.poulp.security.model.JwtTokens createTokens(org.springframework.security.core.Authentication authentication) {
    java.lang.String token;
    java.lang.String refreshToken;
    net.poulp.security.model.UserDto user = ((net.poulp.security.model.UserDto) (authentication.getPrincipal()));
    token = createToken(((net.poulp.security.model.UserDto) (authentication.getPrincipal())));
    refreshToken = createRefreshToken(user);
    return new net.poulp.security.model.JwtTokens(token, refreshToken);
}