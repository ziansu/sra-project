@java.lang.Override
public java.lang.String createToken(net.poulp.security.model.UserDto user) {
    return net.poulp.security.service.impl.Jwts.builder().signWith(SignatureAlgorithm.HS512, secret).setExpiration(getTokenExpirationDate(false)).setIssuedAt(new java.util.Date()).setClaims(buildUserClaims(user)).compact();
}