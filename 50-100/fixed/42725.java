private java.lang.String extractJsonWebToken(io.gravitee.gateway.api.Request request) {
    final java.lang.String authorization = request.headers().getFirst(HttpHeaders.AUTHORIZATION);
    java.lang.String jwt;
    if (authorization != null) {
        jwt = authorization.substring(io.gravitee.policy.jwt.JWTPolicy.BEARER.length()).trim();
    }else {
        jwt = request.parameters().getFirst(io.gravitee.policy.jwt.JWTPolicy.ACCESS_TOKEN);
    }
    return jwt;
}