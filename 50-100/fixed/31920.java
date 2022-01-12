@java.lang.Override
public java.lang.String getCachedAuthenticationToken(final java.lang.Integer userId) {
    final org.projectforge.framework.persistence.user.entities.PFUserDO user = getUserGroupCache().getUser(userId);
    if (user == null) {
        return null;
    }
    final java.lang.String authenticationToken = user.getAuthenticationToken();
    if (((org.apache.commons.lang.StringUtils.isBlank(authenticationToken)) == false) && ((authenticationToken.trim().length()) >= 10)) {
        return authenticationToken;
    }
    return userDao.getAuthenticationToken(userId);
}