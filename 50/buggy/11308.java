public java.util.Date getExpirationDateFromToken(java.lang.String token) {
    java.util.Date expiration;
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        expiration = claims.getExpiration();
    } catch (java.lang.Exception e) {
        expiration = null;
    }
    return expiration;
}