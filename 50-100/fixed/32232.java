public java.lang.Boolean validateToken(java.lang.String token, org.springframework.security.core.userdetails.UserDetails userDetails) {
    net.odtel.tv.security.JwtUser user = ((net.odtel.tv.security.JwtUser) (userDetails));
    final java.lang.String username = getUsernameFromToken(token);
    boolean after = getExpirationDateFromToken(token).after(new java.util.Date());
    return ((username.equals(user.getUsername())) && (!(isTokenExpired(token)))) && after;
}