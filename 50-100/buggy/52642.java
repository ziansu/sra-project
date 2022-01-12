public java.lang.String getAudienceFromToken(java.lang.String token) {
    java.lang.String audience;
    try {
        final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
        audience = ((java.lang.String) (claims.get(base.security.jwt.JwtTokenUtil.CLAIM_KEY_AUDIENCE)));
    } catch (java.lang.Exception e) {
        audience = null;
    }
    return audience;
}