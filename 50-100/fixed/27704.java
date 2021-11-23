private com.e451.rest.security.Claims getClaimsFromToken(java.lang.String token) {
    com.e451.rest.security.Claims claims;
    try {
        com.e451.rest.security.JwtParser parser = com.e451.rest.security.Jwts.parser();
        if ((privateKeyEncoded.isEmpty()) || (publicKeyEncoded.isEmpty())) {
            parser.setSigningKey("secret");
        }else {
            parser.setSigningKey(getPublicKey());
        }
        claims = parser.parseClaimsJws(token).getBody();
    } catch (java.lang.Exception e) {
        claims = null;
    }
    return claims;
}