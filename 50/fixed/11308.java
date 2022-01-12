public java.util.Date getExpirationDateFromToken(java.lang.String token) {
    java.util.Date expiration = null;
    final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
    if (claims != null) {
        expiration = claims.getExpiration();
    }
    return expiration;
}