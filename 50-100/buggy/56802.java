@java.lang.Override
public java.lang.String createRefreshToken(net.poulp.security.model.UserDto user) {
    return net.poulp.security.service.impl.Jwts.builder().signWith(SignatureAlgorithm.HS512, secret).setExpiration(getTokenExpirationDate(true)).setIssuedAt(new java.util.Date()).setClaims(buildUserClaims(user)).compact();
}