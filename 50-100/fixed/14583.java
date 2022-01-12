public java.util.Date getCreatedDateFromToken(java.lang.String token) {
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        return new java.util.Date(((java.lang.Long) (claims.get(fr.cmi.backend.security.jwt.JwtTokenUtil.CLAIM_KEY_CREATED))));
    } catch (java.lang.Exception e) {
        return null;
    }
}