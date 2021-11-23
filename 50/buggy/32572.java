@java.lang.Override
public boolean checkAuthorizationHeader(java.util.Optional<java.lang.String> authHeader) {
    return extractToken(authHeader).map(( t) -> tokenManager.verify(t)).orElse(false);
}