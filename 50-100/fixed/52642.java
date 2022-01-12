public java.lang.String getAudienceFromToken(java.lang.String token) {
    java.lang.String audience = null;
    final io.jsonwebtoken.Claims claims = getClaimsFromToken(token);
    if (claims != null) {
        audience = ((java.lang.String) (claims.get(base.security.jwt.JwtTokenUtil.CLAIM_KEY_AUDIENCE)));
    }
    return audience;
}