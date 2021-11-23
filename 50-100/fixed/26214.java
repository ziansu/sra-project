static org.springframework.security.core.Authentication getAuthentication(javax.servlet.http.HttpServletRequest request) {
    java.lang.String token = request.getHeader(org.lenndi.umtapo.configuration.security.TokenAuthenticationService.HEADER_STRING);
    if (token != null) {
        java.lang.String user = io.jsonwebtoken.Jwts.parser().setSigningKey(org.lenndi.umtapo.configuration.security.TokenAuthenticationService.SECRET).parseClaimsJws(token.replace(org.lenndi.umtapo.configuration.security.TokenAuthenticationService.TOKEN_PREFIX, "")).getBody().getSubject();
        if (user != null) {
            return new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(user, null, java.util.Collections.emptyList());
        }else {
            return null;
        }
    }
    return null;
}