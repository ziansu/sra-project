private java.lang.String getUsernameForUserId(int id) {
    if (id > 0) {
        java.lang.String username = userIdentityStore.getPortalUserName(id);
        if (username != null) {
            return username;
        }
        logger.warn("Invalid userID {} found when exporting a portlet; return system username instead");
    }
    return systemUsername;
}