public org.projectforge.framework.persistence.user.entities.PFUserDO logon(final java.lang.String username) {
    final org.projectforge.framework.persistence.user.entities.PFUserDO user = userService.getByUsername(username);
    if (user == null) {
        fail(("User not found: " + username));
    }
    org.projectforge.framework.persistence.user.api.ThreadLocalUserContext.setUser(getUserGroupCache(), org.projectforge.framework.persistence.user.entities.PFUserDO.createCopyWithoutSecretFields(user));
    return user;
}