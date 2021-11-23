public java.lang.Boolean validateToken(java.lang.String token, org.springframework.security.core.userdetails.UserDetails userDetails) {
    org.springframework.security.core.userdetails.UserDetails user = userDetails;
    final java.lang.String username = getUsernameFromToken(token);
    final java.util.Date created = getCreatedDateFromToken(token);
    return (username.equals(user.getUsername())) && (!(isTokenExpired(token)));
}