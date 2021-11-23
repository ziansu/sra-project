public java.lang.String refreshToken(java.lang.String token) {
    java.lang.String refreshedToken;
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        claims.put(base.security.jwt.JwtTokenUtil.CLAIM_KEY_CREATED, new java.util.Date());
        refreshedToken = generateToken(claims);
    } catch (java.lang.Exception e) {
        refreshedToken = null;
    }
    return refreshedToken;
}