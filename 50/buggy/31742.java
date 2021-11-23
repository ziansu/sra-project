public java.lang.String getAudienceFromToken(java.lang.String token) {
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        return ((java.lang.String) (claims.get(fr.cmi.backend.security.jwt.JwtTokenUtil.CLAIM_KEY_AUDIENCE)));
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}