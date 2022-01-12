public java.util.Date getCreatedDateFromToken(java.lang.String token) {
    java.util.Date created = null;
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        if (claims != null) {
            created = new java.util.Date(((java.lang.Long) (claims.get(base.security.jwt.JwtTokenUtil.CLAIM_KEY_CREATED))));
        }
    } catch (java.lang.Exception e) {
        created = null;
    }
    return created;
}