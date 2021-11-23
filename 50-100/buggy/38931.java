@java.lang.Override
public boolean changePasswordUsingToken(java.lang.Long userId, java.lang.String newPassword, java.lang.String token) {
    if (tokenCache.validateToken(userId.toString(), token)) {
        tokenCache.removeToken(userId.toString());
        com.wadpam.guja.oauth2.domain.DUser user = getById(userId);
        user.setPassword(passwordEncoder.encode(newPassword));
        return true;
    }
    return false;
}