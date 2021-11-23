public java.lang.String refreshToken(java.lang.String token) {
    java.lang.String refreshedToken = null;
    final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
    if (claims != null) {
        claims.put(base.security.jwt.JwtTokenUtil.CLAIM_KEY_CREATED, new java.util.Date());
        refreshedToken = generateToken(claims);
    }
    return refreshedToken;
}