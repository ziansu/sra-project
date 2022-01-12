@org.springframework.transaction.annotation.Transactional
public user.repository.JwtUser validateToken(java.lang.String token) {
    user.repository.JwtUser jwtUser = null;
    try {
        jwtUser = jwtService.getUser(token);
    } catch (java.lang.Exception ex) {
        throw new user.exception.InvalidTokenException(token);
    }
    return jwtUser;
}