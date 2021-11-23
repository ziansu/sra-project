public java.util.Date getExpirationDateFromToken(java.lang.String token) {
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    } catch (java.lang.Exception e) {
        return null;
    }
}